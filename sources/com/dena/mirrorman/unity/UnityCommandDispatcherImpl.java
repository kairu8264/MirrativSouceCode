package com.dena.mirrorman.unity;

import com.dena.mirrorman.unity.MRUnityPlayerEvent;
import dq.c;
import dq.l;
import java.util.LinkedList;
import java.util.Queue;
import jo.h;
import jo.p;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class UnityCommandDispatcherImpl implements UnityCommandDispatcher {
    private boolean isEnabledMessageQueue;
    private final Queue<UnityCommand> queue = new LinkedList();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final UnityCommandDispatcherImpl instance = new UnityCommandDispatcherImpl();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final UnityCommandDispatcherImpl getInstance() {
            return UnityCommandDispatcherImpl.instance;
        }
    }

    private UnityCommandDispatcherImpl() {
        c.c().p(this);
    }

    @Override // com.dena.mirrorman.unity.UnityCommandDispatcher
    public void dispatch(UnityCommand unityCommand) {
        p.h(unityCommand, "unityCommand");
        if (this.isEnabledMessageQueue) {
            this.queue.add(unityCommand);
        } else {
            unityCommand.sendMessage();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(MRUnityPlayerEvent.ResumeUnity resumeUnity) {
        p.h(resumeUnity, "event");
        this.isEnabledMessageQueue = false;
        for (UnityCommand unityCommand : this.queue) {
            unityCommand.sendMessage();
        }
        this.queue.clear();
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(MRUnityPlayerEvent.PauseUnity pauseUnity) {
        p.h(pauseUnity, "event");
        this.isEnabledMessageQueue = true;
    }
}
