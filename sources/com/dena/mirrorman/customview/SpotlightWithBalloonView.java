package com.dena.mirrorman.customview;

import ae.sm;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.databinding.f;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.h;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class SpotlightWithBalloonView extends ConstraintLayout {
    public final sm U;
    public String V;
    public String W;

    /* renamed from: a0  reason: collision with root package name */
    public int f25603a0;

    /* renamed from: b0  reason: collision with root package name */
    public RectF f25604b0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotlightWithBalloonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ SpotlightWithBalloonView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setSpotlightPadding(int i10) {
        this.f25603a0 = i10;
        this.U.E.setSpotlightPadding(i10);
        w();
    }

    public final String getDirection() {
        return this.W;
    }

    public final RectF getSpotlightRect() {
        return this.f25604b0;
    }

    public final String getText() {
        return this.V;
    }

    public final void setDirection(String str) {
        p.h(str, "value");
        this.W = str;
        this.U.C.setDirection(str);
        w();
    }

    public final void setSpotlightRect(RectF rectF) {
        p.h(rectF, "value");
        this.f25604b0 = rectF;
        this.U.E.setSpotlightRect(rectF);
        w();
    }

    public final void setText(String str) {
        p.h(str, "value");
        this.V = str;
        this.U.C.setBalloonText(str);
    }

    public final void w() {
        View view = this.U.B;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = ((int) this.f25604b0.height()) + this.f25603a0;
        ((ViewGroup.MarginLayoutParams) bVar).width = ((int) this.f25604b0.width()) + this.f25603a0;
        RectF rectF = this.f25604b0;
        bVar.setMargins((int) rectF.left, (int) rectF.top, 0, 0);
        view.setLayoutParams(bVar);
        c cVar = new c();
        cVar.g(this.U.D);
        String str = this.W;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    cVar.i(this.U.C.getId(), 4, this.U.B.getId(), 3);
                    cVar.i(this.U.C.getId(), 6, this.U.B.getId(), 6);
                    cVar.i(this.U.C.getId(), 7, this.U.B.getId(), 7);
                    cVar.e(this.U.C.getId(), 3);
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    cVar.i(this.U.C.getId(), 3, this.U.B.getId(), 4);
                    cVar.i(this.U.C.getId(), 6, this.U.B.getId(), 6);
                    cVar.i(this.U.C.getId(), 7, this.U.B.getId(), 7);
                    cVar.e(this.U.C.getId(), 4);
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    cVar.i(this.U.C.getId(), 3, this.U.B.getId(), 3);
                    cVar.i(this.U.C.getId(), 6, this.U.B.getId(), 7);
                    cVar.i(this.U.C.getId(), 4, this.U.B.getId(), 4);
                    cVar.e(this.U.C.getId(), 7);
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    cVar.i(this.U.C.getId(), 3, this.U.B.getId(), 3);
                    cVar.i(this.U.C.getId(), 4, this.U.B.getId(), 4);
                    cVar.i(this.U.C.getId(), 7, this.U.B.getId(), 6);
                    cVar.e(this.U.C.getId(), 6);
                    break;
                }
                break;
        }
        cVar.c(this.U.D);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightWithBalloonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (sm) f.e(LayoutInflater.from(getContext()), b1.view_spotlight_with_balloon, this, true);
        this.V = "";
        this.W = "top";
        this.f25604b0 = new RectF();
    }
}
