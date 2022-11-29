package com.dena.mirrativ.player.gifting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dena.mirrativ.player.gifting.FocusedGiftView;
import com.dena.mirrativ.player.gifting.panel.PlayerGiftPagerCell;
import hb.x1;
import java.util.Arrays;
import jf.f;
import jf.q;
import jo.h;
import jo.i0;
import jo.p;
import kb.d0;
import lb.l;
import wn.v;

/* loaded from: classes2.dex */
public final class FocusedGiftView extends ConstraintLayout {
    public final d0 U;
    public l V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusedGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ FocusedGiftView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void x(FocusedGiftView focusedGiftView, q qVar, View view) {
        p.h(focusedGiftView, "this$0");
        p.h(qVar, "$gift");
        l lVar = focusedGiftView.V;
        if (lVar != null) {
            PlayerGiftPagerCell playerGiftPagerCell = focusedGiftView.U.D;
            p.g(playerGiftPagerCell, "binding.giftCell");
            lVar.R0(playerGiftPagerCell, qVar);
        }
    }

    public final void setCoinNum(f fVar) {
        p.h(fVar, "coin");
        AppCompatTextView appCompatTextView = this.U.C;
        i0 i0Var = i0.f38149a;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.c())}, 1));
        p.g(format, "format(format, *args)");
        appCompatTextView.setText(format);
        AppCompatTextView appCompatTextView2 = this.U.F;
        String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.d())}, 1));
        p.g(format2, "format(format, *args)");
        appCompatTextView2.setText(format2);
    }

    public final void setGift(final q qVar) {
        p.h(qVar, "gift");
        this.U.D.y(qVar, true);
        setOnClickListener(new View.OnClickListener() { // from class: lb.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FocusedGiftView.x(FocusedGiftView.this, qVar, view);
            }
        });
    }

    public final void setGiftCellClickedListener(l lVar) {
        this.V = lVar;
    }

    public final void setOnAnimationEnd(io.l<? super q, v> lVar) {
        p.h(lVar, "function");
        this.U.D.setOnProgressAnimationEnd(lVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusedGiftView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (d0) androidx.databinding.f.e(LayoutInflater.from(context), x1.view_focused_gift, this, true);
    }
}
