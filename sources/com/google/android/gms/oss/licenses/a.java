package com.google.android.gms.oss.licenses;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import org.xmlpull.v1.XmlPullParser;
import qi.f;
import qi.h;
import qi.s;
import vi.c;
import vi.g;

/* loaded from: classes3.dex */
public final class a implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OssLicensesMenuActivity f27297a;

    public a(OssLicensesMenuActivity ossLicensesMenuActivity) {
        this.f27297a = ossLicensesMenuActivity;
    }

    @Override // vi.c
    public final void a(g<String> gVar) {
        ListView listView;
        ArrayAdapter arrayAdapter;
        ListView listView2;
        String packageName = this.f27297a.getPackageName();
        if (this.f27297a.isDestroyed() || this.f27297a.isFinishing()) {
            return;
        }
        if (gVar.s()) {
            packageName = gVar.o();
        }
        OssLicensesMenuActivity ossLicensesMenuActivity = this.f27297a;
        ossLicensesMenuActivity.R = f.c(ossLicensesMenuActivity, packageName);
        OssLicensesMenuActivity ossLicensesMenuActivity2 = this.f27297a;
        f unused = ossLicensesMenuActivity2.T;
        LayoutInflater layoutInflater = this.f27297a.getLayoutInflater();
        h hVar = this.f27297a.R;
        Resources resources = hVar.f49518a;
        ossLicensesMenuActivity2.setContentView(layoutInflater.inflate((XmlPullParser) resources.getXml(resources.getIdentifier("libraries_social_licenses_license_menu_activity", TtmlNode.TAG_LAYOUT, hVar.f49519b)), (ViewGroup) null, false));
        OssLicensesMenuActivity ossLicensesMenuActivity3 = this.f27297a;
        f unused2 = ossLicensesMenuActivity3.T;
        h hVar2 = this.f27297a.R;
        ossLicensesMenuActivity3.O = (ListView) ossLicensesMenuActivity3.findViewById(hVar2.f49518a.getIdentifier("license_list", TtmlNode.ATTR_ID, hVar2.f49519b));
        OssLicensesMenuActivity ossLicensesMenuActivity4 = this.f27297a;
        OssLicensesMenuActivity ossLicensesMenuActivity5 = this.f27297a;
        ossLicensesMenuActivity4.P = new OssLicensesMenuActivity.a(ossLicensesMenuActivity5);
        listView = this.f27297a.O;
        arrayAdapter = this.f27297a.P;
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView2 = this.f27297a.O;
        listView2.setOnItemClickListener(new s(this));
    }
}
