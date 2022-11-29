package ah;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public String f1632a;

    /* renamed from: b  reason: collision with root package name */
    public List<tg.d> f1633b;

    /* renamed from: c  reason: collision with root package name */
    public String f1634c;

    /* renamed from: d  reason: collision with root package name */
    public tg.d f1635d;

    /* renamed from: e  reason: collision with root package name */
    public String f1636e;

    /* renamed from: f  reason: collision with root package name */
    public String f1637f;

    /* renamed from: g  reason: collision with root package name */
    public Double f1638g;

    /* renamed from: h  reason: collision with root package name */
    public String f1639h;

    /* renamed from: i  reason: collision with root package name */
    public String f1640i;

    /* renamed from: j  reason: collision with root package name */
    public rg.u f1641j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1642k;

    /* renamed from: l  reason: collision with root package name */
    public View f1643l;

    /* renamed from: m  reason: collision with root package name */
    public View f1644m;

    /* renamed from: n  reason: collision with root package name */
    public Object f1645n;

    /* renamed from: o  reason: collision with root package name */
    public Bundle f1646o = new Bundle();

    /* renamed from: p  reason: collision with root package name */
    public boolean f1647p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1648q;

    /* renamed from: r  reason: collision with root package name */
    public float f1649r;

    public final void A(boolean z10) {
        this.f1647p = z10;
    }

    public final void B(@RecentlyNonNull String str) {
        this.f1640i = str;
    }

    public final void C(@RecentlyNonNull Double d10) {
        this.f1638g = d10;
    }

    public final void D(@RecentlyNonNull String str) {
        this.f1639h = str;
    }

    public abstract void E(@RecentlyNonNull View view, @RecentlyNonNull Map<String, View> map, @RecentlyNonNull Map<String, View> map2);

    public void F(@RecentlyNonNull View view) {
    }

    public final void G(@RecentlyNonNull rg.u uVar) {
        this.f1641j = uVar;
    }

    public final void H(@RecentlyNonNull Object obj) {
        this.f1645n = obj;
    }

    @RecentlyNonNull
    public final rg.u I() {
        return this.f1641j;
    }

    @RecentlyNonNull
    public final View J() {
        return this.f1644m;
    }

    @RecentlyNonNull
    public final Object K() {
        return this.f1645n;
    }

    @RecentlyNonNull
    public View a() {
        return this.f1643l;
    }

    @RecentlyNonNull
    public final String b() {
        return this.f1637f;
    }

    @RecentlyNonNull
    public final String c() {
        return this.f1634c;
    }

    @RecentlyNonNull
    public final String d() {
        return this.f1636e;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    @RecentlyNonNull
    public final Bundle g() {
        return this.f1646o;
    }

    @RecentlyNonNull
    public final String h() {
        return this.f1632a;
    }

    @RecentlyNonNull
    public final tg.d i() {
        return this.f1635d;
    }

    @RecentlyNonNull
    public final List<tg.d> j() {
        return this.f1633b;
    }

    public float k() {
        return this.f1649r;
    }

    public final boolean l() {
        return this.f1648q;
    }

    public final boolean m() {
        return this.f1647p;
    }

    @RecentlyNonNull
    public final String n() {
        return this.f1640i;
    }

    @RecentlyNonNull
    public final Double o() {
        return this.f1638g;
    }

    @RecentlyNonNull
    public final String p() {
        return this.f1639h;
    }

    public void q(@RecentlyNonNull View view) {
    }

    public boolean r() {
        return this.f1642k;
    }

    public void s() {
    }

    public final void t(@RecentlyNonNull String str) {
        this.f1637f = str;
    }

    public final void u(@RecentlyNonNull String str) {
        this.f1634c = str;
    }

    public final void v(@RecentlyNonNull String str) {
        this.f1636e = str;
    }

    public final void w(@RecentlyNonNull String str) {
        this.f1632a = str;
    }

    public final void x(@RecentlyNonNull tg.d dVar) {
        this.f1635d = dVar;
    }

    public final void y(@RecentlyNonNull List<tg.d> list) {
        this.f1633b = list;
    }

    public final void z(boolean z10) {
        this.f1648q = z10;
    }
}
