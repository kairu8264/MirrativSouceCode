package o3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a f43922a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static class b implements a {

        /* renamed from: v  reason: collision with root package name */
        public static final int f43923v = ViewConfiguration.getTapTimeout();

        /* renamed from: w  reason: collision with root package name */
        public static final int f43924w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a  reason: collision with root package name */
        public int f43925a;

        /* renamed from: b  reason: collision with root package name */
        public int f43926b;

        /* renamed from: c  reason: collision with root package name */
        public int f43927c;

        /* renamed from: d  reason: collision with root package name */
        public int f43928d;

        /* renamed from: e  reason: collision with root package name */
        public final Handler f43929e;

        /* renamed from: f  reason: collision with root package name */
        public final GestureDetector.OnGestureListener f43930f;

        /* renamed from: g  reason: collision with root package name */
        public GestureDetector.OnDoubleTapListener f43931g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f43932h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f43933i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f43934j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f43935k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f43936l;

        /* renamed from: m  reason: collision with root package name */
        public MotionEvent f43937m;

        /* renamed from: n  reason: collision with root package name */
        public MotionEvent f43938n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f43939o;

        /* renamed from: p  reason: collision with root package name */
        public float f43940p;

        /* renamed from: q  reason: collision with root package name */
        public float f43941q;

        /* renamed from: r  reason: collision with root package name */
        public float f43942r;

        /* renamed from: s  reason: collision with root package name */
        public float f43943s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f43944t;

        /* renamed from: u  reason: collision with root package name */
        public VelocityTracker f43945u;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f43929e = new a(handler);
            } else {
                this.f43929e = new a();
            }
            this.f43930f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            e(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
        @Override // o3.e.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 589
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o3.e.b.a(android.view.MotionEvent):boolean");
        }

        public final void b() {
            this.f43929e.removeMessages(1);
            this.f43929e.removeMessages(2);
            this.f43929e.removeMessages(3);
            this.f43945u.recycle();
            this.f43945u = null;
            this.f43939o = false;
            this.f43932h = false;
            this.f43935k = false;
            this.f43936l = false;
            this.f43933i = false;
            if (this.f43934j) {
                this.f43934j = false;
            }
        }

        public final void c() {
            this.f43929e.removeMessages(1);
            this.f43929e.removeMessages(2);
            this.f43929e.removeMessages(3);
            this.f43939o = false;
            this.f43935k = false;
            this.f43936l = false;
            this.f43933i = false;
            if (this.f43934j) {
                this.f43934j = false;
            }
        }

        public void d() {
            this.f43929e.removeMessages(3);
            this.f43933i = false;
            this.f43934j = true;
            this.f43930f.onLongPress(this.f43937m);
        }

        public final void e(Context context) {
            if (context != null) {
                if (this.f43930f != null) {
                    this.f43944t = true;
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                    this.f43927c = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f43928d = viewConfiguration.getScaledMaximumFlingVelocity();
                    this.f43925a = scaledTouchSlop * scaledTouchSlop;
                    this.f43926b = scaledDoubleTapSlop * scaledDoubleTapSlop;
                    return;
                }
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        public final boolean f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.f43936l && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= f43924w) {
                int x10 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y10 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (x10 * x10) + (y10 * y10) < this.f43926b;
            }
            return false;
        }

        public void g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f43931g = onDoubleTapListener;
        }

        /* loaded from: classes.dex */
        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    b bVar = b.this;
                    bVar.f43930f.onShowPress(bVar.f43937m);
                } else if (i10 == 2) {
                    b.this.d();
                } else if (i10 == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f43931g;
                    if (onDoubleTapListener != null) {
                        if (!bVar2.f43932h) {
                            onDoubleTapListener.onSingleTapConfirmed(bVar2.f43937m);
                        } else {
                            bVar2.f43933i = true;
                        }
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            public a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final GestureDetector f43947a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f43947a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // o3.e.a
        public boolean a(MotionEvent motionEvent) {
            return this.f43947a.onTouchEvent(motionEvent);
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f43922a.a(motionEvent);
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f43922a = new c(context, onGestureListener, handler);
        } else {
            this.f43922a = new b(context, onGestureListener, handler);
        }
    }
}
