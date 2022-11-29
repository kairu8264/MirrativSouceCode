package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.MutableFlags;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kk.n;

/* loaded from: classes3.dex */
public final class ListenerSet<T, E extends MutableFlags> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private static final int MSG_LAZY_RELEASE = 1;
    private final Clock clock;
    private final n<E> eventFlagsSupplier;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T, E> iterationFinishedEvent;
    private final CopyOnWriteArraySet<ListenerHolder<T, E>> listeners;
    private final ArrayDeque<Runnable> queuedEvents;
    private boolean released;

    /* loaded from: classes3.dex */
    public interface Event<T> {
        void invoke(T t10);
    }

    /* loaded from: classes3.dex */
    public interface IterationFinishedEvent<T, E extends MutableFlags> {
        void invoke(T t10, E e10);
    }

    /* loaded from: classes3.dex */
    public static final class ListenerHolder<T, E extends MutableFlags> {
        private E eventsFlags;
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(T t10, n<E> nVar) {
            this.listener = t10;
            this.eventsFlags = nVar.get();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.listener.equals(((ListenerHolder) obj).listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        public void invoke(int i10, Event<T> event) {
            if (this.released) {
                return;
            }
            if (i10 != -1) {
                this.eventsFlags.add(i10);
            }
            this.needsIterationFinishedEvent = true;
            event.invoke(this.listener);
        }

        public void iterationFinished(n<E> nVar, IterationFinishedEvent<T, E> iterationFinishedEvent) {
            if (this.released || !this.needsIterationFinishedEvent) {
                return;
            }
            E e10 = this.eventsFlags;
            this.eventsFlags = nVar.get();
            this.needsIterationFinishedEvent = false;
            iterationFinishedEvent.invoke(this.listener, e10);
        }

        public void release(IterationFinishedEvent<T, E> iterationFinishedEvent) {
            this.released = true;
            if (this.needsIterationFinishedEvent) {
                iterationFinishedEvent.invoke(this.listener, this.eventsFlags);
            }
        }
    }

    public ListenerSet(Looper looper, Clock clock, n<E> nVar, IterationFinishedEvent<T, E> iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, nVar, iterationFinishedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            Iterator<ListenerHolder<T, E>> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().iterationFinished(this.eventFlagsSupplier, this.iterationFinishedEvent);
                if (this.handler.hasMessages(0)) {
                    break;
                }
            }
        } else if (i10 == 1) {
            sendEvent(message.arg1, (Event) message.obj);
            release();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i10, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ListenerHolder) it.next()).invoke(i10, event);
        }
    }

    public void add(T t10) {
        if (this.released) {
            return;
        }
        Assertions.checkNotNull(t10);
        this.listeners.add(new ListenerHolder<>(t10, this.eventFlagsSupplier));
    }

    public ListenerSet<T, E> copy(Looper looper, IterationFinishedEvent<T, E> iterationFinishedEvent) {
        return new ListenerSet<>(this.listeners, looper, this.clock, this.eventFlagsSupplier, iterationFinishedEvent);
    }

    public void flushEvents() {
        if (this.queuedEvents.isEmpty()) {
            return;
        }
        if (!this.handler.hasMessages(0)) {
            this.handler.obtainMessage(0).sendToTarget();
        }
        boolean z10 = !this.flushingEvents.isEmpty();
        this.flushingEvents.addAll(this.queuedEvents);
        this.queuedEvents.clear();
        if (z10) {
            return;
        }
        while (!this.flushingEvents.isEmpty()) {
            this.flushingEvents.peekFirst().run();
            this.flushingEvents.removeFirst();
        }
    }

    public void lazyRelease(int i10, Event<T> event) {
        this.handler.obtainMessage(1, i10, 0, event).sendToTarget();
    }

    public void queueEvent(final int i10, final Event<T> event) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.listeners);
        this.queuedEvents.add(new Runnable() { // from class: com.google.android.exoplayer2.util.b
            @Override // java.lang.Runnable
            public final void run() {
                ListenerSet.lambda$queueEvent$0(copyOnWriteArraySet, i10, event);
            }
        });
    }

    public void release() {
        Iterator<ListenerHolder<T, E>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
        this.released = true;
    }

    public void remove(T t10) {
        Iterator<ListenerHolder<T, E>> it = this.listeners.iterator();
        while (it.hasNext()) {
            ListenerHolder<T, E> next = it.next();
            if (next.listener.equals(t10)) {
                next.release(this.iterationFinishedEvent);
                this.listeners.remove(next);
            }
        }
    }

    public void sendEvent(int i10, Event<T> event) {
        queueEvent(i10, event);
        flushEvents();
    }

    private ListenerSet(CopyOnWriteArraySet<ListenerHolder<T, E>> copyOnWriteArraySet, Looper looper, Clock clock, n<E> nVar, IterationFinishedEvent<T, E> iterationFinishedEvent) {
        this.clock = clock;
        this.listeners = copyOnWriteArraySet;
        this.eventFlagsSupplier = nVar;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.flushingEvents = new ArrayDeque<>();
        this.queuedEvents = new ArrayDeque<>();
        this.handler = clock.createHandler(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleMessage;
                handleMessage = ListenerSet.this.handleMessage(message);
                return handleMessage;
            }
        });
    }
}
