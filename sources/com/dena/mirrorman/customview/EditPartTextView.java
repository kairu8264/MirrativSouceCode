package com.dena.mirrorman.customview;

import ae.k9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.lifecycle.u;
import com.dena.mirrorman.customview.EditPartTextView;
import io.p;
import nd.b1;
import of.j;
import sf.b;
import wn.v;
import yd.i;

/* loaded from: classes2.dex */
public final class EditPartTextView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final k9 f25332w;

    /* renamed from: x  reason: collision with root package name */
    public p<? super String, ? super String, v> f25333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPartTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jo.p.h(context, "context");
        jo.p.h(attributeSet, "attrs");
        k9 k9Var = (k9) f.e(LayoutInflater.from(getContext()), b1.view_edit_part_text, this, true);
        this.f25332w = k9Var;
        setOnClickListener(new View.OnClickListener() { // from class: yd.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditPartTextView.d(EditPartTextView.this, view);
            }
        });
        k9Var.D.addTextChangedListener(new i(this));
        k9Var.D.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: yd.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                EditPartTextView.e(EditPartTextView.this, view, z10);
            }
        });
    }

    public static final void d(EditPartTextView editPartTextView, View view) {
        jo.p.h(editPartTextView, "this$0");
        editPartTextView.f25332w.D.requestFocus();
        j.e(j.f45405a, editPartTextView.getContext(), editPartTextView.f25332w.D, 0, 4, null);
    }

    public static final void e(EditPartTextView editPartTextView, View view, boolean z10) {
        jo.p.h(editPartTextView, "this$0");
        if (z10) {
            editPartTextView.f25332w.E.setVisibility(0);
            editPartTextView.f25332w.B.setVisibility(4);
            return;
        }
        editPartTextView.f25332w.E.setVisibility(8);
        editPartTextView.f25332w.B.setVisibility(0);
    }

    public static final boolean h(EditPartTextView editPartTextView, jf.p pVar, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(editPartTextView, "this$0");
        jo.p.h(pVar, "$bindModel");
        if (i10 == 6 || keyEvent.getKeyCode() == 66) {
            p<? super String, ? super String, v> pVar2 = editPartTextView.f25333x;
            if (pVar2 != null) {
                pVar2.invoke(pVar.d(), editPartTextView.f25332w.D.getText().toString());
            }
            j.f45405a.c(editPartTextView.getContext(), editPartTextView.f25332w.D);
            return true;
        }
        return false;
    }

    public final void g(u uVar, final jf.p pVar) {
        jo.p.h(uVar, "viewLifecycleOwner");
        jo.p.h(pVar, "bindModel");
        this.f25332w.M(uVar);
        this.f25332w.U(pVar);
        this.f25332w.D.setFilters(new b[]{new b(pVar.e())});
        this.f25332w.D.setHint(pVar.b() == 0 ? "" : getResources().getString(pVar.b()));
        this.f25332w.D.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yd.h
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean h10;
                h10 = EditPartTextView.h(EditPartTextView.this, pVar, textView, i10, keyEvent);
                return h10;
            }
        });
    }

    public final p<String, String, v> getOnCompleteChangeNameListener() {
        return this.f25333x;
    }

    public final void i() {
        this.f25332w.D.requestFocus();
    }

    public final void setOnCompleteChangeNameListener(p<? super String, ? super String, v> pVar) {
        this.f25333x = pVar;
    }
}
