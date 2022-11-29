package com.dena.mirrorman.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.dena.mirrorman.customview.LongClickRepeatView;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LongClickRepeatView extends View {

    /* renamed from: w  reason: collision with root package name */
    public View.OnClickListener f25506w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f25507x;

    /* renamed from: y  reason: collision with root package name */
    public b f25508y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f25505z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LongClickRepeatView.this.f25507x) {
                View.OnClickListener onClickListener = LongClickRepeatView.this.f25506w;
                if (onClickListener != null) {
                    onClickListener.onClick(LongClickRepeatView.this);
                }
                if (!LongClickRepeatView.this.isEnabled()) {
                    LongClickRepeatView.this.f25507x = false;
                } else {
                    LongClickRepeatView.this.getHandler().postDelayed(this, 200L);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LongClickRepeatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LongClickRepeatView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final boolean c(LongClickRepeatView longClickRepeatView, View view) {
        p.h(longClickRepeatView, "this$0");
        longClickRepeatView.f25507x = true;
        longClickRepeatView.getHandler().post(longClickRepeatView.f25508y);
        return true;
    }

    public static final boolean d(LongClickRepeatView longClickRepeatView, View view, MotionEvent motionEvent) {
        p.h(longClickRepeatView, "this$0");
        if (motionEvent.getAction() == 1) {
            longClickRepeatView.f25507x = false;
        }
        return false;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f25506w = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongClickRepeatView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25508y = new b();
        setClickable(true);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: yd.o0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean c10;
                c10 = LongClickRepeatView.c(LongClickRepeatView.this, view);
                return c10;
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: yd.p0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean d10;
                d10 = LongClickRepeatView.d(LongClickRepeatView.this, view, motionEvent);
                return d10;
            }
        });
    }
}
