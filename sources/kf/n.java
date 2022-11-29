package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.m;

/* loaded from: classes2.dex */
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38727a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38728b;

    public n(Context context) {
        jo.p.h(context, "context");
        this.f38727a = context;
        this.f38728b = "LivePref";
    }

    @Override // kf.m
    public void A4(String str) {
        jo.p.h(str, "value");
        A5("appIconUrl", str);
    }

    public void A5(String str, String str2) {
        m.a.b(this, str, str2);
    }

    public void B5(String str, boolean z10) {
        m.a.c(this, str, z10);
    }

    public String C5(String str, String str2) {
        return m.a.d(this, str, str2);
    }

    @Override // kf.m
    public String D1() {
        return C5("appTitle", "");
    }

    @Override // kf.m
    public void D3(String str) {
        jo.p.h(str, "value");
        A5("appTitle", str);
    }

    public boolean D5(String str, boolean z10) {
        return m.a.e(this, str, z10);
    }

    @Override // kf.m
    public String F0() {
        return C5("appUserId", "");
    }

    @Override // kf.m
    public void J4(String str) {
        jo.p.h(str, "value");
        A5("LIVE_ID", str);
    }

    @Override // kf.m
    public void L2(String str) {
        jo.p.h(str, "value");
        A5("DESCRIPTION", str);
    }

    @Override // kf.m
    public String R() {
        return C5("appIconUrl", "");
    }

    @Override // kf.m
    public boolean V() {
        return D5("isOmotenashi", false);
    }

    @Override // kf.m
    public boolean W0() {
        return D5("IS_PRIVATE", false);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return m.a.a(this);
    }

    @Override // kf.m
    public String b() {
        return C5("LIVE_ID", "");
    }

    @Override // kf.m
    public String b1() {
        return C5("DESCRIPTION", "");
    }

    @Override // kf.m
    public String e5() {
        return C5("shortTitle", "");
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38727a;
    }

    @Override // kf.m
    public String getTitle() {
        return C5("TITLE", "");
    }

    @Override // kf.m
    public String h() {
        return C5("APP_ID", "");
    }

    @Override // kf.m
    public void l4(String str) {
        jo.p.h(str, "value");
        A5("SHARE_URL", str);
    }

    @Override // kf.m
    public String q3() {
        return C5("SHARE_URL", "");
    }

    @Override // kf.m
    public void q5(boolean z10) {
        B5("isOmotenashi", z10);
    }

    @Override // kf.m
    public String r3() {
        return C5("searchKeywords", "");
    }

    @Override // kf.m
    public void s2(String str) {
        jo.p.h(str, "value");
        A5("appUserId", str);
    }

    @Override // kf.m
    public void u0(boolean z10) {
        B5("IS_PRIVATE", z10);
    }

    @Override // kf.m
    public void v0(String str) {
        jo.p.h(str, "value");
        A5("APP_ID", str);
    }

    @Override // kf.m
    public void x2(String str) {
        jo.p.h(str, "value");
        A5("shortTitle", str);
    }

    @Override // kf.o
    public String z() {
        return this.f38728b;
    }

    @Override // kf.m
    public void z3(String str) {
        jo.p.h(str, "value");
        A5("TITLE", str);
    }
}
