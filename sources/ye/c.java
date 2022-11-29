package ye;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LiveOwnedBitrateControlParams;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import jo.p;

/* loaded from: classes2.dex */
public final class c implements Parcelable {
    public String A;
    public String B;
    public String C;
    public String D;
    public boolean E;
    public String F;
    public int G;
    public int H;
    public LinkedLive I;
    public int J;
    public double K;

    /* renamed from: w  reason: collision with root package name */
    public int f61816w;

    /* renamed from: x  reason: collision with root package name */
    public Intent f61817x;

    /* renamed from: y  reason: collision with root package name */
    public int f61818y;

    /* renamed from: z  reason: collision with root package name */
    public int f61819z;
    public static final a L = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();
    public static final int M = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(c cVar, int i10, Intent intent) {
            p.h(cVar, "recordRequestParams");
            return new c(i10, intent, cVar.getWidth(), cVar.getHeight(), cVar.b(), cVar.i(), null, cVar.j(), cVar.e(), cVar.h(), cVar.g(), cVar.d(), cVar.a(), cVar.l(), cVar.k(), 64, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final c createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new c(parcel.readInt(), (Intent) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), (LinkedLive) parcel.readSerializable(), parcel.readInt(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c() {
        this(0, null, 0, 0, null, null, null, null, false, null, 0, 0, null, 0, 0.0d, 32767, null);
    }

    public c(int i10, Intent intent, int i11, int i12, String str, String str2, String str3, String str4, boolean z10, String str5, int i13, int i14, LinkedLive linkedLive, int i15, double d10) {
        p.h(str, "liveID");
        p.h(str5, "qualityLevel");
        this.f61816w = i10;
        this.f61817x = intent;
        this.f61818y = i11;
        this.f61819z = i12;
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = z10;
        this.F = str5;
        this.G = i13;
        this.H = i14;
        this.I = linkedLive;
        this.J = i15;
        this.K = d10;
    }

    public final LinkedLive a() {
        return this.I;
    }

    public final String b() {
        return this.A;
    }

    public final String c() {
        return this.C;
    }

    public final int d() {
        return this.H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f61816w == cVar.f61816w && p.c(this.f61817x, cVar.f61817x) && this.f61818y == cVar.f61818y && this.f61819z == cVar.f61819z && p.c(this.A, cVar.A) && p.c(this.B, cVar.B) && p.c(this.C, cVar.C) && p.c(this.D, cVar.D) && this.E == cVar.E && p.c(this.F, cVar.F) && this.G == cVar.G && this.H == cVar.H && p.c(this.I, cVar.I) && this.J == cVar.J && p.c(Double.valueOf(this.K), Double.valueOf(cVar.K));
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final MediaProjection f(MediaProjectionManager mediaProjectionManager) {
        p.h(mediaProjectionManager, "manager");
        int i10 = this.f61816w;
        Intent intent = this.f61817x;
        p.e(intent);
        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i10, intent);
        p.g(mediaProjection, "manager.getMediaProjecti…Code, projectionIntent!!)");
        return mediaProjection;
    }

    public final int g() {
        return this.G;
    }

    public final int getHeight() {
        return this.f61819z;
    }

    public final int getWidth() {
        return this.f61818y;
    }

    public final String h() {
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f61816w) * 31;
        Intent intent = this.f61817x;
        int hashCode2 = (((((((hashCode + (intent == null ? 0 : intent.hashCode())) * 31) + Integer.hashCode(this.f61818y)) * 31) + Integer.hashCode(this.f61819z)) * 31) + this.A.hashCode()) * 31;
        String str = this.B;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.C;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.D;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z10 = this.E;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode6 = (((((((hashCode5 + i10) * 31) + this.F.hashCode()) * 31) + Integer.hashCode(this.G)) * 31) + Integer.hashCode(this.H)) * 31;
        LinkedLive linkedLive = this.I;
        return ((((hashCode6 + (linkedLive != null ? linkedLive.hashCode() : 0)) * 31) + Integer.hashCode(this.J)) * 31) + Double.hashCode(this.K);
    }

    public final String i() {
        return this.B;
    }

    public final String j() {
        return this.D;
    }

    public final double k() {
        return this.K;
    }

    public final int l() {
        return this.J;
    }

    public final void m(LiveOwnedResponse liveOwnedResponse) {
        Double decreaseRate;
        Integer increaseValue;
        p.h(liveOwnedResponse, "ownedResponse");
        this.A = liveOwnedResponse.getLiveId();
        this.B = liveOwnedResponse.getStreamingUploadUrl2();
        this.C = liveOwnedResponse.getStreamingUploadUrl3();
        this.D = liveOwnedResponse.getStreamingKey();
        this.G = liveOwnedResponse.getProjectionUseDisplaySize();
        this.H = liveOwnedResponse.getMaxCollabUserNum();
        this.I = liveOwnedResponse.getLinkedLive();
        LiveOwnedBitrateControlParams bitrateControlParams = liveOwnedResponse.getBitrateControlParams();
        this.J = (bitrateControlParams == null || (increaseValue = bitrateControlParams.getIncreaseValue()) == null) ? this.J : increaseValue.intValue();
        LiveOwnedBitrateControlParams bitrateControlParams2 = liveOwnedResponse.getBitrateControlParams();
        this.K = (bitrateControlParams2 == null || (decreaseRate = bitrateControlParams2.getDecreaseRate()) == null) ? this.K : decreaseRate.doubleValue();
    }

    public final void n(LinkedLive linkedLive) {
        this.I = linkedLive;
    }

    public final void o(String str) {
        p.h(str, "<set-?>");
        this.A = str;
    }

    public final void p(LiveOwnedResponse liveOwnedResponse, int i10, int i11, String str, boolean z10) {
        Double decreaseRate;
        Integer increaseValue;
        p.h(str, "quality");
        if (liveOwnedResponse != null) {
            this.A = liveOwnedResponse.getLiveId();
            this.B = liveOwnedResponse.getStreamingUploadUrl2();
            this.D = liveOwnedResponse.getStreamingKey();
            this.G = liveOwnedResponse.getProjectionUseDisplaySize();
            this.H = liveOwnedResponse.getMaxCollabUserNum();
            this.I = liveOwnedResponse.getLinkedLive();
            LiveOwnedBitrateControlParams bitrateControlParams = liveOwnedResponse.getBitrateControlParams();
            this.J = (bitrateControlParams == null || (increaseValue = bitrateControlParams.getIncreaseValue()) == null) ? this.J : increaseValue.intValue();
            LiveOwnedBitrateControlParams bitrateControlParams2 = liveOwnedResponse.getBitrateControlParams();
            this.K = (bitrateControlParams2 == null || (decreaseRate = bitrateControlParams2.getDecreaseRate()) == null) ? this.K : decreaseRate.doubleValue();
        }
        this.f61818y = i10;
        this.f61819z = i11;
        this.E = z10;
        this.F = str;
    }

    public String toString() {
        return "RecordRequestParams(resultCode=" + this.f61816w + ", projectionIntent=" + this.f61817x + ", width=" + this.f61818y + ", height=" + this.f61819z + ", liveID=" + this.A + ", rtmpUrl2=" + this.B + ", llstreamUrl=" + this.C + ", streamingKey=" + this.D + ", micGranted=" + this.E + ", qualityLevel=" + this.F + ", projection_use_display_size=" + this.G + ", max_collab_user_num=" + this.H + ", linkedLive=" + this.I + ", videoBitrateIncreaseValue=" + this.J + ", videoBitrateDecreaseRate=" + this.K + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.f61816w);
        parcel.writeParcelable(this.f61817x, i10);
        parcel.writeInt(this.f61818y);
        parcel.writeInt(this.f61819z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeSerializable(this.I);
        parcel.writeInt(this.J);
        parcel.writeDouble(this.K);
    }

    public /* synthetic */ c(int i10, Intent intent, int i11, int i12, String str, String str2, String str3, String str4, boolean z10, String str5, int i13, int i14, LinkedLive linkedLive, int i15, double d10, int i16, jo.h hVar) {
        this((i16 & 1) != 0 ? 0 : i10, (i16 & 2) != 0 ? null : intent, (i16 & 4) != 0 ? 0 : i11, (i16 & 8) != 0 ? 0 : i12, (i16 & 16) != 0 ? "" : str, (i16 & 32) != 0 ? null : str2, (i16 & 64) != 0 ? null : str3, (i16 & 128) != 0 ? null : str4, (i16 & 256) != 0 ? false : z10, (i16 & 512) == 0 ? str5 : "", (i16 & 1024) != 0 ? 0 : i13, (i16 & 2048) == 0 ? i14 : 0, (i16 & 4096) == 0 ? linkedLive : null, (i16 & 8192) != 0 ? 32000 : i15, (i16 & 16384) != 0 ? 0.75d : d10);
    }
}
