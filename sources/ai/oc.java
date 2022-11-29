package ai;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class oc implements Parcelable {
    public static final Parcelable.Creator<oc> CREATOR = new nc();
    public final String A;
    public final String B;
    public final int C;
    public final List<byte[]> D;
    public final ie E;
    public final int F;
    public final int G;
    public final float H;
    public final int I;
    public final float J;
    public final int K;
    public final byte[] L;
    public final yj M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final long S;
    public final int T;
    public final String U;
    public final int V;
    public int W;

    /* renamed from: w  reason: collision with root package name */
    public final String f7711w;

    /* renamed from: x  reason: collision with root package name */
    public final int f7712x;

    /* renamed from: y  reason: collision with root package name */
    public final String f7713y;

    /* renamed from: z  reason: collision with root package name */
    public final rg f7714z;

    public oc(Parcel parcel) {
        this.f7711w = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.f7713y = parcel.readString();
        this.f7712x = parcel.readInt();
        this.C = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readFloat();
        this.I = parcel.readInt();
        this.J = parcel.readFloat();
        this.L = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.K = parcel.readInt();
        this.M = (yj) parcel.readParcelable(yj.class.getClassLoader());
        this.N = parcel.readInt();
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readString();
        this.V = parcel.readInt();
        this.S = parcel.readLong();
        int readInt = parcel.readInt();
        this.D = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.D.add(parcel.createByteArray());
        }
        this.E = (ie) parcel.readParcelable(ie.class.getClassLoader());
        this.f7714z = (rg) parcel.readParcelable(rg.class.getClassLoader());
    }

    public static oc a(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, byte[] bArr, int i15, yj yjVar, ie ieVar) {
        return new oc(str, null, str2, null, -1, i11, i12, i13, -1.0f, i14, f11, bArr, i15, yjVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, ieVar, null);
    }

    public static oc b(String str, String str2, String str3, int i10, int i11, int i12, int i13, List<byte[]> list, ie ieVar, int i14, String str4) {
        return c(str, str2, null, -1, -1, i12, i13, -1, -1, -1, null, ieVar, 0, str4, null);
    }

    public static oc c(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<byte[]> list, ie ieVar, int i17, String str4, rg rgVar) {
        return new oc(str, null, str2, null, -1, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, -1, -1, i17, str4, -1, Long.MAX_VALUE, list, ieVar, null);
    }

    public static oc d(String str, String str2, String str3, int i10, int i11, String str4, int i12, ie ieVar, long j10, List<byte[]> list) {
        return new oc(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, -1, j10, list, ieVar, null);
    }

    public static oc e(String str, String str2, String str3, int i10, List<byte[]> list, String str4, ie ieVar) {
        return new oc(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, ieVar, null);
    }

    public static oc f(String str, String str2, String str3, int i10, ie ieVar) {
        return new oc(str, null, MimeTypes.APPLICATION_CAMERA_MOTION, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, ieVar, null);
    }

    @TargetApi(16)
    public static void m(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oc.class == obj.getClass()) {
            oc ocVar = (oc) obj;
            if (this.f7712x == ocVar.f7712x && this.C == ocVar.C && this.F == ocVar.F && this.G == ocVar.G && this.H == ocVar.H && this.I == ocVar.I && this.J == ocVar.J && this.K == ocVar.K && this.N == ocVar.N && this.O == ocVar.O && this.P == ocVar.P && this.Q == ocVar.Q && this.R == ocVar.R && this.S == ocVar.S && this.T == ocVar.T && vj.a(this.f7711w, ocVar.f7711w) && vj.a(this.U, ocVar.U) && this.V == ocVar.V && vj.a(this.A, ocVar.A) && vj.a(this.B, ocVar.B) && vj.a(this.f7713y, ocVar.f7713y) && vj.a(this.E, ocVar.E) && vj.a(this.f7714z, ocVar.f7714z) && vj.a(this.M, ocVar.M) && Arrays.equals(this.L, ocVar.L) && this.D.size() == ocVar.D.size()) {
                for (int i10 = 0; i10 < this.D.size(); i10++) {
                    if (!Arrays.equals(this.D.get(i10), ocVar.D.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final oc g(int i10) {
        return new oc(this.f7711w, this.A, this.B, this.f7713y, this.f7712x, i10, this.F, this.G, this.H, this.I, this.J, this.L, this.K, this.M, this.N, this.O, this.P, this.Q, this.R, this.T, this.U, this.V, this.S, this.D, this.E, this.f7714z);
    }

    public final oc h(int i10, int i11) {
        return new oc(this.f7711w, this.A, this.B, this.f7713y, this.f7712x, this.C, this.F, this.G, this.H, this.I, this.J, this.L, this.K, this.M, this.N, this.O, this.P, i10, i11, this.T, this.U, this.V, this.S, this.D, this.E, this.f7714z);
    }

    public final int hashCode() {
        int i10 = this.W;
        if (i10 == 0) {
            String str = this.f7711w;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.A;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.B;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f7713y;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f7712x) * 31) + this.F) * 31) + this.G) * 31) + this.N) * 31) + this.O) * 31;
            String str5 = this.U;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.V) * 31;
            ie ieVar = this.E;
            int hashCode6 = (hashCode5 + (ieVar == null ? 0 : ieVar.hashCode())) * 31;
            rg rgVar = this.f7714z;
            int hashCode7 = hashCode6 + (rgVar != null ? rgVar.hashCode() : 0);
            this.W = hashCode7;
            return hashCode7;
        }
        return i10;
    }

    public final oc i(ie ieVar) {
        return new oc(this.f7711w, this.A, this.B, this.f7713y, this.f7712x, this.C, this.F, this.G, this.H, this.I, this.J, this.L, this.K, this.M, this.N, this.O, this.P, this.Q, this.R, this.T, this.U, this.V, this.S, this.D, ieVar, this.f7714z);
    }

    public final oc j(rg rgVar) {
        return new oc(this.f7711w, this.A, this.B, this.f7713y, this.f7712x, this.C, this.F, this.G, this.H, this.I, this.J, this.L, this.K, this.M, this.N, this.O, this.P, this.Q, this.R, this.T, this.U, this.V, this.S, this.D, this.E, rgVar);
    }

    public final int k() {
        int i10;
        int i11 = this.F;
        if (i11 == -1 || (i10 = this.G) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat l() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.B);
        String str = this.U;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m(mediaFormat, "max-input-size", this.C);
        m(mediaFormat, "width", this.F);
        m(mediaFormat, "height", this.G);
        float f10 = this.H;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        m(mediaFormat, "rotation-degrees", this.I);
        m(mediaFormat, "channel-count", this.N);
        m(mediaFormat, "sample-rate", this.O);
        m(mediaFormat, "encoder-delay", this.Q);
        m(mediaFormat, "encoder-padding", this.R);
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i10);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap(this.D.get(i10)));
        }
        yj yjVar = this.M;
        if (yjVar != null) {
            m(mediaFormat, "color-transfer", yjVar.f12629y);
            m(mediaFormat, "color-standard", yjVar.f12627w);
            m(mediaFormat, "color-range", yjVar.f12628x);
            byte[] bArr = yjVar.f12630z;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.f7711w;
        String str2 = this.A;
        String str3 = this.B;
        int i10 = this.f7712x;
        String str4 = this.U;
        int i11 = this.F;
        int i12 = this.G;
        float f10 = this.H;
        int i13 = this.N;
        int i14 = this.O;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("Format(");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append("], [");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(i14);
        sb2.append("])");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7711w);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.f7713y);
        parcel.writeInt(this.f7712x);
        parcel.writeInt(this.C);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeFloat(this.H);
        parcel.writeInt(this.I);
        parcel.writeFloat(this.J);
        parcel.writeInt(this.L != null ? 1 : 0);
        byte[] bArr = this.L;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.K);
        parcel.writeParcelable(this.M, i10);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.T);
        parcel.writeString(this.U);
        parcel.writeInt(this.V);
        parcel.writeLong(this.S);
        int size = this.D.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.D.get(i11));
        }
        parcel.writeParcelable(this.E, 0);
        parcel.writeParcelable(this.f7714z, 0);
    }

    public oc(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, yj yjVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List<byte[]> list, ie ieVar, rg rgVar) {
        this.f7711w = str;
        this.A = str2;
        this.B = str3;
        this.f7713y = str4;
        this.f7712x = i10;
        this.C = i11;
        this.F = i12;
        this.G = i13;
        this.H = f10;
        this.I = i14;
        this.J = f11;
        this.L = bArr;
        this.K = i15;
        this.M = yjVar;
        this.N = i16;
        this.O = i17;
        this.P = i18;
        this.Q = i19;
        this.R = i20;
        this.T = i21;
        this.U = str5;
        this.V = i22;
        this.S = j10;
        this.D = list == null ? Collections.emptyList() : list;
        this.E = ieVar;
        this.f7714z = rgVar;
    }
}
