package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import e.b;
import ii.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import n4.a;
import org.xmlpull.v1.XmlPullParser;
import qi.f;
import qi.h;
import qi.k;
import qi.n;
import qi.r;
import vi.g;

/* loaded from: classes3.dex */
public final class OssLicensesMenuActivity extends b implements a.InterfaceC0614a<List<c>> {
    public static String U;
    public ListView O;
    public ArrayAdapter<c> P;
    public boolean Q;
    public h R;
    public g<String> S;
    public f T;

    /* loaded from: classes3.dex */
    public class a extends ArrayAdapter<c> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.content.Context r4) {
            /*
                r2 = this;
                com.google.android.gms.oss.licenses.OssLicensesMenuActivity.this = r3
                com.google.android.gms.oss.licenses.OssLicensesMenuActivity.D3(r3)
                qi.h r0 = com.google.android.gms.oss.licenses.OssLicensesMenuActivity.B3(r3)
                int r0 = qi.f.a(r0)
                com.google.android.gms.oss.licenses.OssLicensesMenuActivity.D3(r3)
                qi.h r3 = com.google.android.gms.oss.licenses.OssLicensesMenuActivity.B3(r3)
                int r3 = qi.f.d(r3)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.<init>(r4, r0, r3, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.oss.licenses.OssLicensesMenuActivity.a.<init>(com.google.android.gms.oss.licenses.OssLicensesMenuActivity, android.content.Context):void");
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                f unused = OssLicensesMenuActivity.this.T;
                LayoutInflater layoutInflater = OssLicensesMenuActivity.this.getLayoutInflater();
                h hVar = OssLicensesMenuActivity.this.R;
                view = layoutInflater.inflate((XmlPullParser) hVar.f49518a.getXml(f.a(hVar)), viewGroup, false);
            }
            f unused2 = OssLicensesMenuActivity.this.T;
            ((TextView) view.findViewById(f.d(OssLicensesMenuActivity.this.R))).setText(getItem(i10).toString());
            return view;
        }
    }

    public static boolean x3(Context context, String str) {
        InputStream inputStream = null;
        try {
            Resources resources = context.getResources();
            inputStream = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(qi.a.license_list)));
            boolean z10 = inputStream.available() > 0;
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            return z10;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @Override // n4.a.InterfaceC0614a
    public final o4.b<List<c>> G1(int i10, Bundle bundle) {
        if (this.Q) {
            return new r(this, f.b(this));
        }
        return null;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.T = f.b(this);
        this.Q = x3(this, "third_party_licenses") && x3(this, "third_party_license_metadata");
        if (U == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("title")) {
                U = intent.getStringExtra("title");
                Log.w("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = U;
        if (str != null) {
            setTitle(str);
        }
        if (m3() != null) {
            m3().n(true);
        }
        if (this.Q) {
            k e10 = f.b(this).e();
            this.S = e10.g(new n(e10, getPackageName()));
            b3().d(54321, null, this);
            this.S.c(new com.google.android.gms.oss.licenses.a(this));
            return;
        }
        setContentView(qi.b.license_menu_activity_no_licenses);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public final void onDestroy() {
        b3().a(54321);
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // n4.a.InterfaceC0614a
    public final void t2(o4.b<List<c>> bVar) {
        this.P.clear();
        this.P.notifyDataSetChanged();
    }

    @Override // n4.a.InterfaceC0614a
    /* renamed from: y3 */
    public final void i0(o4.b<List<c>> bVar, List<c> list) {
        this.P.clear();
        this.P.addAll(list);
        this.P.notifyDataSetChanged();
    }
}
