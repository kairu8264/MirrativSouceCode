package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import o3.c0;
import wi.h;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    public final Chip U;
    public final Chip V;
    public final ClockHandView W;

    /* renamed from: a0  reason: collision with root package name */
    public final ClockFaceView f27873a0;

    /* renamed from: b0  reason: collision with root package name */
    public final MaterialButtonToggleGroup f27874b0;

    /* renamed from: c0  reason: collision with root package name */
    public final View.OnClickListener f27875c0;

    /* renamed from: d0  reason: collision with root package name */
    public f f27876d0;

    /* renamed from: e0  reason: collision with root package name */
    public g f27877e0;

    /* renamed from: f0  reason: collision with root package name */
    public e f27878f0;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f27877e0 != null) {
                TimePickerView.this.f27877e0.a(((Integer) view.getTag(wi.f.J)).intValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements MaterialButtonToggleGroup.e {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11 = i10 == wi.f.f58845k ? 1 : 0;
            if (TimePickerView.this.f27876d0 == null || !z10) {
                return;
            }
            TimePickerView.this.f27876d0.a(i11);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f27878f0 != null) {
                TimePickerView.this.f27878f0.a();
            }
            return onDoubleTap;
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GestureDetector f27882w;

        public d(GestureDetector gestureDetector) {
            this.f27882w = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f27882w.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(int i10);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(int i10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void A() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.U.setOnTouchListener(dVar);
        this.V.setOnTouchListener(dVar);
    }

    public final void B() {
        if (this.f27874b0.getVisibility() == 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(this);
            cVar.e(wi.f.f58842h, c0.E(this) == 0 ? 2 : 1);
            cVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        B();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            B();
        }
    }

    public final void z() {
        Chip chip = this.U;
        int i10 = wi.f.J;
        chip.setTag(i10, 12);
        this.V.setTag(i10, 10);
        this.U.setOnClickListener(this.f27875c0);
        this.V.setOnClickListener(this.f27875c0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27875c0 = new a();
        LayoutInflater.from(context).inflate(h.f58874l, this);
        this.f27873a0 = (ClockFaceView) findViewById(wi.f.f58843i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(wi.f.f58846l);
        this.f27874b0 = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.U = (Chip) findViewById(wi.f.f58849o);
        this.V = (Chip) findViewById(wi.f.f58847m);
        this.W = (ClockHandView) findViewById(wi.f.f58844j);
        A();
        z();
    }
}
