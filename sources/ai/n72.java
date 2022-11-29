package ai;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class n72 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final fs f7222a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7223b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7224c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7225d;

    /* renamed from: e  reason: collision with root package name */
    public final float f7226e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7227f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7228g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7229h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7230i;

    public n72(fs fsVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        rh.p.j(fsVar, "the adSize must not be null");
        this.f7222a = fsVar;
        this.f7223b = str;
        this.f7224c = z10;
        this.f7225d = str2;
        this.f7226e = f10;
        this.f7227f = i10;
        this.f7228g = i11;
        this.f7229h = str3;
        this.f7230i = z11;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        km2.b(bundle2, "smart_w", "full", this.f7222a.A == -1);
        km2.b(bundle2, "smart_h", TtmlNode.TEXT_EMPHASIS_AUTO, this.f7222a.f4174x == -2);
        Boolean bool = Boolean.TRUE;
        km2.d(bundle2, "ene", bool, this.f7222a.F);
        km2.b(bundle2, "rafmt", "102", this.f7222a.I);
        km2.b(bundle2, "rafmt", "103", this.f7222a.J);
        km2.b(bundle2, "rafmt", "105", this.f7222a.K);
        km2.d(bundle2, "inline_adaptive_slot", bool, this.f7230i);
        km2.d(bundle2, "interscroller_slot", bool, this.f7222a.K);
        km2.e(bundle2, "format", this.f7223b);
        km2.b(bundle2, "fluid", "height", this.f7224c);
        km2.b(bundle2, "sz", this.f7225d, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.f7226e);
        bundle2.putInt("sw", this.f7227f);
        bundle2.putInt("sh", this.f7228g);
        String str2 = this.f7229h;
        km2.b(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        fs[] fsVarArr = this.f7222a.C;
        if (fsVarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f7222a.f4174x);
            bundle3.putInt("width", this.f7222a.A);
            bundle3.putBoolean("is_fluid_height", this.f7222a.E);
            arrayList.add(bundle3);
        } else {
            for (fs fsVar : fsVarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", fsVar.E);
                bundle4.putInt("height", fsVar.f4174x);
                bundle4.putInt("width", fsVar.A);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
