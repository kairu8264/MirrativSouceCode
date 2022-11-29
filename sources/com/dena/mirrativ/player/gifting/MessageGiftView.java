package com.dena.mirrativ.player.gifting;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import com.dena.mirrativ.player.gifting.MessageGiftView;
import de.n;
import hb.v1;
import hb.x1;
import hb.z1;
import io.l;
import jf.q;
import jo.h;
import jo.p;
import kb.g1;
import kotlin.NoWhenBranchMatchedException;
import of.j;
import rf.e;
import wn.v;

/* loaded from: classes2.dex */
public final class MessageGiftView extends ConstraintLayout {
    public final g1 U;
    public final u V;
    public final e W;

    /* renamed from: a0  reason: collision with root package name */
    public l<? super String, v> f22678a0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ MessageGiftView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void B(MessageGiftView messageGiftView, String str) {
        p.h(messageGiftView, "this$0");
        String obj = messageGiftView.U.H.getText().toString();
        p.g(str, "message");
        if (obj.compareTo(str) == 0) {
            return;
        }
        messageGiftView.U.H.setText(str);
    }

    public static final void C(MessageGiftView messageGiftView, Boolean bool) {
        int i10;
        int i11;
        int i12;
        p.h(messageGiftView, "this$0");
        AppCompatImageView appCompatImageView = messageGiftView.U.F;
        if (p.c(bool, Boolean.FALSE)) {
            i10 = v1.ic_emokara_request_mic_disabled;
        } else if (!p.c(bool, Boolean.TRUE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            i10 = v1.ic_emokara_request_mic_enabled;
        }
        appCompatImageView.setImageResource(i10);
        LinearLayout linearLayout = messageGiftView.U.B;
        p.g(bool, "enabled");
        boolean booleanValue = bool.booleanValue();
        if (!booleanValue) {
            i11 = v1.rectangle_emokara_request_gift_coin_bg_disable;
        } else if (booleanValue) {
            i11 = v1.rectangle_emokara_request_gift_coin_bg_enable;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        linearLayout.setBackgroundResource(i11);
        AppCompatImageView appCompatImageView2 = messageGiftView.U.C;
        boolean booleanValue2 = bool.booleanValue();
        if (!booleanValue2) {
            i12 = z1.ic_coin_gray;
        } else if (booleanValue2) {
            i12 = z1.f35042f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView2.setImageResource(i12);
    }

    public static final void E(MessageGiftView messageGiftView, View view) {
        p.h(messageGiftView, "this$0");
        String f10 = messageGiftView.W.m().f();
        if (f10 == null) {
            return;
        }
        if (f10.length() == 0) {
            return;
        }
        if (!messageGiftView.W.w()) {
            messageGiftView.G();
            return;
        }
        l<? super String, v> lVar = messageGiftView.f22678a0;
        if (lVar != null) {
            lVar.invoke(f10);
        }
        messageGiftView.z();
    }

    public final void A() {
        this.W.m().i(this.V, new f0() { // from class: lb.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MessageGiftView.B(MessageGiftView.this, (String) obj);
            }
        });
        this.W.o().i(this.V, new f0() { // from class: lb.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MessageGiftView.C(MessageGiftView.this, (Boolean) obj);
            }
        });
    }

    public final void D() {
        this.U.M(this.V);
        this.U.T(this.W);
        this.U.H.addTextChangedListener(this.W.q());
        this.U.B.setOnClickListener(new View.OnClickListener() { // from class: lb.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageGiftView.E(MessageGiftView.this, view);
            }
        });
    }

    public final void F(q qVar, String str, String str2, String str3, boolean z10, l<? super String, v> lVar) {
        p.h(qVar, "gift");
        p.h(str, "title");
        p.h(str2, "hint");
        p.h(str3, "defaultText");
        p.h(lVar, "onSendButtonClicked");
        this.W.v(qVar.e(), str, str2, z10);
        setVisibility(0);
        this.f22678a0 = lVar;
        EditText editText = this.U.H;
        editText.setFilters(new InputFilter[]{this.W.l()});
        editText.setText(str3, TextView.BufferType.EDITABLE);
        editText.requestFocus();
        j.e(j.f45405a, getContext(), editText, 0, 4, null);
    }

    public final void G() {
    }

    public final void z() {
        this.W.i();
        setVisibility(8);
        this.f22678a0 = null;
        EditText editText = this.U.H;
        editText.clearFocus();
        j.f45405a.c(getContext(), editText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageGiftView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (g1) f.e(LayoutInflater.from(context), x1.view_message_gift, this, true);
        u c10 = n.c(this);
        p.e(c10);
        this.V = c10;
        this.W = (e) new t0.d().a(e.class);
        D();
        A();
    }
}
