package com.dena.mirrorman.customview;

import ae.om;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import c3.a;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingMember;
import com.google.android.material.card.MaterialCardView;
import de.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.p;
import nd.b1;
import nd.f1;
import nd.w0;
import tj.k;
import tj.o;
import wn.v;
import xn.s;
import xn.t;
import yd.j1;

/* loaded from: classes2.dex */
public final class ShooterMatchingViewerPopUpView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final om f25597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShooterMatchingViewerPopUpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        om omVar = (om) f.e(LayoutInflater.from(getContext()), b1.view_shooter_matching_viewer_pop_up, this, true);
        this.f25597w = omVar;
        int b10 = n.b(this, 1);
        float b11 = n.b(this, 6);
        View view = omVar.B;
        PaintDrawable paintDrawable = new PaintDrawable(a.d(getContext(), w0.U0));
        paintDrawable.setShape(new RectShape());
        paintDrawable.setCornerRadius(b11);
        v vVar = v.f59242a;
        PaintDrawable paintDrawable2 = new PaintDrawable();
        paintDrawable2.setShape(new RectShape());
        paintDrawable2.setCornerRadius(b11);
        paintDrawable2.setShaderFactory(new j1(this));
        LayerDrawable layerDrawable = new LayerDrawable(new PaintDrawable[]{paintDrawable, paintDrawable2});
        layerDrawable.setLayerInset(1, b10, b10, b10, b10);
        view.setBackground(layerDrawable);
        MaterialCardView materialCardView = omVar.C;
        k.b p10 = k.a().p(new tj.a(b11));
        p.g(materialCardView, "");
        materialCardView.setShapeAppearanceModel(p10.q(new o(n.b(materialCardView, 8), false)).m());
    }

    public final void a(List<ShooterMatchingMember> list) {
        p.h(list, MRLog.TARGET_TYPE_VIEWER);
        MultipleUserView multipleUserView = this.f25597w.E;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        for (ShooterMatchingMember shooterMatchingMember : list) {
            arrayList.add(shooterMatchingMember.getIconUrl());
        }
        multipleUserView.g(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<T> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.t();
            }
            ShooterMatchingMember shooterMatchingMember2 = (ShooterMatchingMember) next;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    spannableStringBuilder.append((CharSequence) getContext().getString(f1.text_shooter_matching_want_to_play_viewers_label3, String.valueOf(list.size() - i10)));
                    break;
                }
                spannableStringBuilder.append((CharSequence) getContext().getString(f1.text_shooter_matching_want_to_play_viewers_label2));
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) getContext().getString(f1.text_shooter_matching_want_to_play_viewers_label, shooterMatchingMember2.getName()));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(a.d(getContext(), w0.f42237m)), length, spannableStringBuilder.length(), 33);
            i10 = i11;
        }
        spannableStringBuilder.append((CharSequence) getContext().getString(f1.text_shooter_matching_want_to_play_viewers));
        this.f25597w.D.setText(spannableStringBuilder);
    }
}
