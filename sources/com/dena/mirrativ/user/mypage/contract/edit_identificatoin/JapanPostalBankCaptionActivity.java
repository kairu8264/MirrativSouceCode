package com.dena.mirrativ.user.mypage.contract.edit_identificatoin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.dena.mirrativ.user.mypage.contract.edit_identificatoin.JapanPostalBankCaptionActivity;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import nc.e;
import nc.g;
import nc.i;
import pc.m;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class JapanPostalBankCaptionActivity extends e.b {
    public static final a O = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, JapanPostalBankCaptionActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            JapanPostalBankCaptionActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jp-bank.japanpost.jp/kojin/sokin/furikomi/kouza/kj_sk_fm_kz_1.html")));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public static final boolean z3(JapanPostalBankCaptionActivity japanPostalBankCaptionActivity, MenuItem menuItem) {
        p.h(japanPostalBankCaptionActivity, "this$0");
        if (menuItem.getItemId() == e.menu_item_close) {
            japanPostalBankCaptionActivity.finish();
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = f.g(this, nc.f.activity_japan_postal_bank_caption);
        p.g(g10, "setContentView(\n        …al_bank_caption\n        )");
        m mVar = (m) g10;
        AppCompatButton appCompatButton = mVar.B;
        p.g(appCompatButton, "binding.startSearchButton");
        g1.a(appCompatButton, new b());
        y3(mVar);
    }

    public final void y3(m mVar) {
        Toolbar toolbar = mVar.C.B;
        toolbar.inflateMenu(g.bank_select_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: cd.d0
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean z32;
                z32 = JapanPostalBankCaptionActivity.z3(JapanPostalBankCaptionActivity.this, menuItem);
                return z32;
            }
        });
        TextView textView = (TextView) toolbar.findViewById(e.B6);
        if (textView == null) {
            return;
        }
        p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Toolbar.LayoutParams layoutParams2 = layoutParams instanceof Toolbar.LayoutParams ? (Toolbar.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
        }
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(i.text_contract_edit_identification_bank_account_japan_post_bank_title));
        textView.setTextColor(c3.a.d(this, nc.b.F));
        toolbar.setBackgroundResource(nc.h.f41869c);
    }
}
