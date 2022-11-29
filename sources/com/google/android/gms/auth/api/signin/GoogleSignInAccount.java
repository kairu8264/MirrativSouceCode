package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rh.p;
import sh.a;
import sh.b;
import vh.f;
import vh.i;

/* loaded from: classes3.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new jh.a();
    public static f J = i.b();
    public String A;
    public Uri B;
    public String C;
    public long D;
    public String E;
    public List<Scope> F;
    public String G;
    public String H;
    public Set<Scope> I = new HashSet();

    /* renamed from: w  reason: collision with root package name */
    public final int f27160w;

    /* renamed from: x  reason: collision with root package name */
    public String f27161x;

    /* renamed from: y  reason: collision with root package name */
    public String f27162y;

    /* renamed from: z  reason: collision with root package name */
    public String f27163z;

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List<Scope> list, String str7, String str8) {
        this.f27160w = i10;
        this.f27161x = str;
        this.f27162y = str2;
        this.f27163z = str3;
        this.A = str4;
        this.B = uri;
        this.C = str5;
        this.D = j10;
        this.E = str6;
        this.F = list;
        this.G = str7;
        this.H = str8;
    }

    public static GoogleSignInAccount N0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), p.e(str7), new ArrayList((Collection) p.i(set)), str5, str6);
    }

    public static GoogleSignInAccount V0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount N0 = N0(jSONObject.optString(TtmlNode.ATTR_ID), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        N0.C = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return N0;
    }

    public Set<Scope> A0() {
        HashSet hashSet = new HashSet(this.F);
        hashSet.addAll(this.I);
        return hashSet;
    }

    public String D0() {
        return this.C;
    }

    public String P() {
        return this.A;
    }

    public String S() {
        return this.f27163z;
    }

    public String U() {
        return this.H;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.E.equals(this.E) && googleSignInAccount.A0().equals(A0());
        }
        return false;
    }

    public int hashCode() {
        return ((this.E.hashCode() + 527) * 31) + A0().hashCode();
    }

    public String k0() {
        return this.G;
    }

    public Account p() {
        String str = this.f27163z;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String r0() {
        return this.f27161x;
    }

    public String w0() {
        return this.f27162y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.k(parcel, 1, this.f27160w);
        b.q(parcel, 2, r0(), false);
        b.q(parcel, 3, w0(), false);
        b.q(parcel, 4, S(), false);
        b.q(parcel, 5, P(), false);
        b.p(parcel, 6, x0(), i10, false);
        b.q(parcel, 7, D0(), false);
        b.n(parcel, 8, this.D);
        b.q(parcel, 9, this.E, false);
        b.u(parcel, 10, this.F, false);
        b.q(parcel, 11, k0(), false);
        b.q(parcel, 12, U(), false);
        b.b(parcel, a10);
    }

    public Uri x0() {
        return this.B;
    }
}
