package com.google.android.gms.oss.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import e.b;
import ii.c;
import java.util.ArrayList;
import qi.f;
import qi.h;
import qi.i;
import qi.k;
import qi.m;
import qi.o;
import vi.g;
import vi.j;

/* loaded from: classes3.dex */
public final class OssLicensesActivity extends b {
    public c O;
    public String P = "";
    public ScrollView Q = null;
    public TextView R = null;
    public int S = 0;
    public g<String> T;
    public g<String> U;
    public f V;
    public h W;

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(qi.b.libraries_social_licenses_license_loading);
        this.V = f.b(this);
        this.O = (c) getIntent().getParcelableExtra("license");
        if (m3() != null) {
            m3().t(this.O.toString());
            m3().o(true);
            m3().n(true);
            m3().r(null);
        }
        ArrayList arrayList = new ArrayList();
        k e10 = this.V.e();
        g g10 = e10.g(new o(e10, this.O));
        this.T = g10;
        arrayList.add(g10);
        k e11 = this.V.e();
        g g11 = e11.g(new m(e11, getPackageName()));
        this.U = g11;
        arrayList.add(g11);
        j.f(arrayList).c(new i(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.S = bundle.getInt("scroll_pos");
    }

    @Override // androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.R;
        if (textView == null || this.Q == null) {
            return;
        }
        bundle.putInt("scroll_pos", this.R.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.Q.getScrollY())));
    }
}
