package com.dena.mirrorman.feature.emomo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import jf.c0;
import jo.h;
import jo.p;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class EmomoMotionView extends ConstraintLayout {

    /* renamed from: d0  reason: collision with root package name */
    public static final a f25720d0 = new a(null);

    /* renamed from: e0  reason: collision with root package name */
    public static final int f25721e0 = 8;
    public je.a U;
    public GestureDetector V;
    public ScaleGestureDetector W;

    /* renamed from: a0  reason: collision with root package name */
    public final b f25722a0;

    /* renamed from: b0  reason: collision with root package name */
    public final c f25723b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f25724c0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            p.h(motionEvent, "event1");
            p.h(motionEvent2, "event2");
            if (EmomoMotionView.this.f25724c0) {
                return false;
            }
            if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > 400.0f) {
                if (motionEvent.getX() > motionEvent2.getX()) {
                    je.a aVar = EmomoMotionView.this.U;
                    if (aVar != null) {
                        aVar.p2(c0.LEFT);
                    }
                } else {
                    je.a aVar2 = EmomoMotionView.this.U;
                    if (aVar2 != null) {
                        aVar2.p2(c0.RIGHT);
                    }
                }
            } else if (Math.abs(motionEvent.getY() - motionEvent2.getY()) > 50.0f && Math.abs(f11) > 200.0f) {
                if (motionEvent.getY() > motionEvent2.getY()) {
                    je.a aVar3 = EmomoMotionView.this.U;
                    if (aVar3 != null) {
                        aVar3.p2(c0.UP);
                    }
                } else {
                    je.a aVar4 = EmomoMotionView.this.U;
                    if (aVar4 != null) {
                        aVar4.p2(c0.DOWN);
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public float f25726a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f25727b = 1.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f25728c = 1.0f;

        public c() {
        }

        public final float a(float f10) {
            float f11 = this.f25726a * ((1 + this.f25727b) - f10);
            float B = EmomoMotionView.this.C() ? EmomoMotionView.this.B() : 2.0f;
            if (f11 <= 0.6f) {
                f11 = 0.6f;
            } else if (f11 >= B) {
                f11 = B;
            }
            this.f25726a = f11;
            this.f25727b = f10;
            return f11;
        }

        public final String b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("before_distance", Float.valueOf(this.f25728c));
            jSONObject.put("current_distance", Float.valueOf(this.f25726a));
            String jSONObject2 = jSONObject.toString();
            p.g(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            return jSONObject2;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            p.h(scaleGestureDetector, "detector");
            je.a aVar = EmomoMotionView.this.U;
            if (aVar != null) {
                aVar.E0(a(scaleGestureDetector.getScaleFactor()));
                return false;
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            p.h(scaleGestureDetector, "detector");
            this.f25728c = this.f25726a;
            je.a aVar = EmomoMotionView.this.U;
            if (aVar != null) {
                aVar.E0(a(scaleGestureDetector.getScaleFactor()));
            }
            EmomoMotionView.this.f25724c0 = true;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            p.h(scaleGestureDetector, "detector");
            je.a aVar = EmomoMotionView.this.U;
            if (aVar != null) {
                aVar.E0(a(scaleGestureDetector.getScaleFactor()));
            }
            je.a aVar2 = EmomoMotionView.this.U;
            if (aVar2 != null) {
                aVar2.z0(b());
            }
            EmomoMotionView.this.f25724c0 = false;
            this.f25727b = 1.0f;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmomoMotionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ EmomoMotionView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final float B() {
        return (float) ((getMeasuredHeight() * (-0.0016d)) + 4.2d);
    }

    public final boolean C() {
        FragmentManager a32;
        Fragment e02;
        Context context = getContext();
        androidx.fragment.app.h hVar = context instanceof androidx.fragment.app.h ? (androidx.fragment.app.h) context : null;
        if (hVar == null || (a32 = hVar.a3()) == null || (e02 = a32.e0("EmomoDressUpDialog")) == null) {
            return false;
        }
        return e02.r1();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p.h(motionEvent, "event");
        GestureDetector gestureDetector = this.V;
        if (!(gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : false)) {
            ScaleGestureDetector scaleGestureDetector = this.W;
            if (!(scaleGestureDetector != null ? scaleGestureDetector.onTouchEvent(motionEvent) : false)) {
                return false;
            }
        }
        return true;
    }

    public final void setEmomoMotionViewListener(je.a aVar) {
        this.U = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmomoMotionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        b bVar = new b();
        this.f25722a0 = bVar;
        c cVar = new c();
        this.f25723b0 = cVar;
        this.V = new GestureDetector(context, bVar);
        this.W = new ScaleGestureDetector(context, cVar);
    }
}
