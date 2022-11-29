package ak;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u0 extends e {

    /* renamed from: a  reason: collision with root package name */
    public final long f13663a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, AssetPackState> f13664b;

    public u0(long j10, Map<String, AssetPackState> map) {
        this.f13663a = j10;
        this.f13664b = map;
    }

    @Override // ak.e
    public final Map<String, AssetPackState> a() {
        return this.f13664b;
    }

    @Override // ak.e
    public final long b() {
        return this.f13663a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f13663a == eVar.b() && this.f13664b.equals(eVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f13663a;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13664b.hashCode();
    }

    public final String toString() {
        long j10 = this.f13663a;
        String valueOf = String.valueOf(this.f13664b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 61);
        sb2.append("AssetPackStates{totalBytes=");
        sb2.append(j10);
        sb2.append(", packStates=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
