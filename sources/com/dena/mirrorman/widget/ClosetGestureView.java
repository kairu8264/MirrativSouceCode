package com.dena.mirrorman.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import io.l;
import io.p;
import jf.c0;
import jo.h;
import wn.v;

/* loaded from: classes3.dex */
public final class ClosetGestureView extends View {
    public static final a F = new a(null);
    public static final int G = 8;
    public GestureDetector A;
    public ScaleGestureDetector B;
    public final b C;
    public final c D;
    public boolean E;

    /* renamed from: w  reason: collision with root package name */
    public l<? super Float, v> f26341w;

    /* renamed from: x  reason: collision with root package name */
    public io.a<v> f26342x;

    /* renamed from: y  reason: collision with root package name */
    public p<? super Float, ? super Float, v> f26343y;

    /* renamed from: z  reason: collision with root package name */
    public l<? super c0, v> f26344z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public final void a(float f10, float f11) {
            float f12 = -1;
            float f13 = f12 * 10.0f;
            float f14 = f11 > 10.0f ? f13 : f11 < f13 ? f13 * f12 : f11 * f12;
            if (f10 <= 10.0f) {
                f13 = f10 < f13 ? f13 * f12 : f10 * f12;
            }
            p<Float, Float, v> onScrollListener = ClosetGestureView.this.getOnScrollListener();
            if (onScrollListener != null) {
                onScrollListener.invoke(Float.valueOf(f14), Float.valueOf(f13));
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            jo.p.h(motionEvent, "event1");
            jo.p.h(motionEvent2, "event2");
            if (ClosetGestureView.this.E) {
                return false;
            }
            if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > 400.0f) {
                if (motionEvent.getX() > motionEvent2.getX()) {
                    l<c0, v> onFlingListener = ClosetGestureView.this.getOnFlingListener();
                    if (onFlingListener != null) {
                        onFlingListener.invoke(c0.LEFT);
                    }
                } else {
                    l<c0, v> onFlingListener2 = ClosetGestureView.this.getOnFlingListener();
                    if (onFlingListener2 != null) {
                        onFlingListener2.invoke(c0.RIGHT);
                    }
                }
            } else if (Math.abs(motionEvent.getY() - motionEvent2.getY()) > 50.0f && Math.abs(f11) > 200.0f) {
                if (motionEvent.getY() > motionEvent2.getY()) {
                    l<c0, v> onFlingListener3 = ClosetGestureView.this.getOnFlingListener();
                    if (onFlingListener3 != null) {
                        onFlingListener3.invoke(c0.UP);
                    }
                } else {
                    l<c0, v> onFlingListener4 = ClosetGestureView.this.getOnFlingListener();
                    if (onFlingListener4 != null) {
                        onFlingListener4.invoke(c0.DOWN);
                    }
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            jo.p.h(motionEvent, "event1");
            jo.p.h(motionEvent2, "event2");
            if (ClosetGestureView.this.E) {
                return false;
            }
            a(f10, f11);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            io.a<v> onClickListener = ClosetGestureView.this.getOnClickListener();
            if (onClickListener != null) {
                onClickListener.invoke();
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public float f26346a = 1.0f;

        public c() {
        }

        public final float a(float f10) {
            float f11 = this.f26346a;
            this.f26346a = f10;
            float f12 = f10 / f11;
            float f13 = f12 > 1.0f ? 1.0f - f12 : (1.0f / f12) - 1.0f;
            if (f13 <= -1.0f) {
                return -1.0f;
            }
            if (f13 >= 1.0f) {
                return 1.0f;
            }
            return f13;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            jo.p.h(scaleGestureDetector, "detector");
            l<Float, v> onScaleListener = ClosetGestureView.this.getOnScaleListener();
            if (onScaleListener != null) {
                onScaleListener.invoke(Float.valueOf(a(scaleGestureDetector.getScaleFactor())));
                return false;
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            jo.p.h(scaleGestureDetector, "detector");
            this.f26346a = scaleGestureDetector.getScaleFactor();
            ClosetGestureView.this.E = true;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            jo.p.h(scaleGestureDetector, "detector");
            ClosetGestureView.this.E = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClosetGestureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ ClosetGestureView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final io.a<v> getOnClickListener() {
        return this.f26342x;
    }

    public final l<c0, v> getOnFlingListener() {
        return this.f26344z;
    }

    public final l<Float, v> getOnScaleListener() {
        return this.f26341w;
    }

    public final p<Float, Float, v> getOnScrollListener() {
        return this.f26343y;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        jo.p.h(motionEvent, "event");
        GestureDetector gestureDetector = this.A;
        if (!(gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : false)) {
            ScaleGestureDetector scaleGestureDetector = this.B;
            if (!(scaleGestureDetector != null ? scaleGestureDetector.onTouchEvent(motionEvent) : false)) {
                return false;
            }
        }
        return true;
    }

    public final void setOnClickListener(io.a<v> aVar) {
        this.f26342x = aVar;
    }

    public final void setOnFlingListener(l<? super c0, v> lVar) {
        this.f26344z = lVar;
    }

    public final void setOnScaleListener(l<? super Float, v> lVar) {
        this.f26341w = lVar;
    }

    public final void setOnScrollListener(p<? super Float, ? super Float, v> pVar) {
        this.f26343y = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosetGestureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        b bVar = new b();
        this.C = bVar;
        c cVar = new c();
        this.D = cVar;
        this.A = new GestureDetector(context, bVar);
        this.B = new ScaleGestureDetector(context, cVar);
    }
}
