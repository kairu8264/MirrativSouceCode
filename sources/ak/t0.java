package ak;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class t0 extends AssetPackState {

    /* renamed from: a  reason: collision with root package name */
    public final String f13648a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13649b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13650c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13651d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13652e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13653f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13654g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13655h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13656i;

    public t0(String str, int i10, int i11, long j10, long j11, int i12, int i13, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.f13648a = str;
        this.f13649b = i10;
        this.f13650c = i11;
        this.f13651d = j10;
        this.f13652e = j11;
        this.f13653f = i12;
        this.f13654g = i13;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f13655h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.f13656i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long a() {
        return this.f13651d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int b() {
        return this.f13650c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String c() {
        return this.f13648a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int d() {
        return this.f13649b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long e() {
        return this.f13652e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f13648a.equals(assetPackState.c()) && this.f13649b == assetPackState.d() && this.f13650c == assetPackState.b() && this.f13651d == assetPackState.a() && this.f13652e == assetPackState.e() && this.f13653f == assetPackState.f() && this.f13654g == assetPackState.g() && this.f13655h.equals(assetPackState.j()) && this.f13656i.equals(assetPackState.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f13653f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int g() {
        return this.f13654g;
    }

    public final int hashCode() {
        int hashCode = this.f13648a.hashCode();
        int i10 = this.f13649b;
        int i11 = this.f13650c;
        long j10 = this.f13651d;
        long j11 = this.f13652e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13653f) * 1000003) ^ this.f13654g) * 1000003) ^ this.f13655h.hashCode()) * 1000003) ^ this.f13656i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String j() {
        return this.f13655h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String k() {
        return this.f13656i;
    }

    public final String toString() {
        String str = this.f13648a;
        int i10 = this.f13649b;
        int i11 = this.f13650c;
        long j10 = this.f13651d;
        long j11 = this.f13652e;
        int i12 = this.f13653f;
        int i13 = this.f13654g;
        String str2 = this.f13655h;
        String str3 = this.f13656i;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 261 + str2.length() + str3.length());
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i10);
        sb2.append(", errorCode=");
        sb2.append(i11);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j11);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i12);
        sb2.append(", updateAvailability=");
        sb2.append(i13);
        sb2.append(", availableVersionTag=");
        sb2.append(str2);
        sb2.append(", installedVersionTag=");
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }
}
