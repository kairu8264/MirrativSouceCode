package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveStreamingUrlResponse implements Parcelable {
    private final String archiveUrlHls;
    @b(BooleanTypeAdapter.class)
    private final boolean isLive;
    private final MirroringResponse mirroring;
    private final Status status;
    private final String streamingUrlEdge;
    private final String streamingUrlHls;
    private final String streamingUrlLlstreamAudio;
    private final String streamingUrlLlstreamVideo;
    public static final Parcelable.Creator<LiveStreamingUrlResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LiveStreamingUrlResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveStreamingUrlResponse createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new LiveStreamingUrlResponse(parcel.readInt() != 0, parcel.readInt() == 0 ? null : MirroringResponse.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Status) parcel.readParcelable(LiveStreamingUrlResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveStreamingUrlResponse[] newArray(int i10) {
            return new LiveStreamingUrlResponse[i10];
        }
    }

    public LiveStreamingUrlResponse(boolean z10, MirroringResponse mirroringResponse, String str, String str2, String str3, String str4, String str5, Status status) {
        p.h(str, "streamingUrlHls");
        p.h(str2, "streamingUrlEdge");
        p.h(str3, "streamingUrlLlstreamVideo");
        p.h(str4, "streamingUrlLlstreamAudio");
        p.h(str5, "archiveUrlHls");
        p.h(status, "status");
        this.isLive = z10;
        this.mirroring = mirroringResponse;
        this.streamingUrlHls = str;
        this.streamingUrlEdge = str2;
        this.streamingUrlLlstreamVideo = str3;
        this.streamingUrlLlstreamAudio = str4;
        this.archiveUrlHls = str5;
        this.status = status;
    }

    private final String component7() {
        return this.archiveUrlHls;
    }

    public final boolean component1() {
        return this.isLive;
    }

    public final MirroringResponse component2() {
        return this.mirroring;
    }

    public final String component3() {
        return this.streamingUrlHls;
    }

    public final String component4() {
        return this.streamingUrlEdge;
    }

    public final String component5() {
        return this.streamingUrlLlstreamVideo;
    }

    public final String component6() {
        return this.streamingUrlLlstreamAudio;
    }

    public final Status component8() {
        return this.status;
    }

    public final LiveStreamingUrlResponse copy(boolean z10, MirroringResponse mirroringResponse, String str, String str2, String str3, String str4, String str5, Status status) {
        p.h(str, "streamingUrlHls");
        p.h(str2, "streamingUrlEdge");
        p.h(str3, "streamingUrlLlstreamVideo");
        p.h(str4, "streamingUrlLlstreamAudio");
        p.h(str5, "archiveUrlHls");
        p.h(status, "status");
        return new LiveStreamingUrlResponse(z10, mirroringResponse, str, str2, str3, str4, str5, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveStreamingUrlResponse) {
            LiveStreamingUrlResponse liveStreamingUrlResponse = (LiveStreamingUrlResponse) obj;
            return this.isLive == liveStreamingUrlResponse.isLive && p.c(this.mirroring, liveStreamingUrlResponse.mirroring) && p.c(this.streamingUrlHls, liveStreamingUrlResponse.streamingUrlHls) && p.c(this.streamingUrlEdge, liveStreamingUrlResponse.streamingUrlEdge) && p.c(this.streamingUrlLlstreamVideo, liveStreamingUrlResponse.streamingUrlLlstreamVideo) && p.c(this.streamingUrlLlstreamAudio, liveStreamingUrlResponse.streamingUrlLlstreamAudio) && p.c(this.archiveUrlHls, liveStreamingUrlResponse.archiveUrlHls) && p.c(this.status, liveStreamingUrlResponse.status);
        }
        return false;
    }

    public final String getLiveStreamingUrl() {
        if (!this.isLive) {
            if (this.archiveUrlHls.length() > 0) {
                return this.archiveUrlHls;
            }
        }
        if (this.streamingUrlLlstreamVideo.length() > 0) {
            return this.streamingUrlLlstreamVideo;
        }
        if (this.streamingUrlEdge.length() > 0) {
            return this.streamingUrlEdge;
        }
        if (this.streamingUrlHls.length() > 0) {
            return this.streamingUrlHls;
        }
        return null;
    }

    public final MirroringResponse getMirroring() {
        return this.mirroring;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getStreamingUrlEdge() {
        return this.streamingUrlEdge;
    }

    public final String getStreamingUrlHls() {
        return this.streamingUrlHls;
    }

    public final String getStreamingUrlLlstreamAudio() {
        return this.streamingUrlLlstreamAudio;
    }

    public final String getStreamingUrlLlstreamVideo() {
        return this.streamingUrlLlstreamVideo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z10 = this.isLive;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        MirroringResponse mirroringResponse = this.mirroring;
        return ((((((((((((i10 + (mirroringResponse == null ? 0 : mirroringResponse.hashCode())) * 31) + this.streamingUrlHls.hashCode()) * 31) + this.streamingUrlEdge.hashCode()) * 31) + this.streamingUrlLlstreamVideo.hashCode()) * 31) + this.streamingUrlLlstreamAudio.hashCode()) * 31) + this.archiveUrlHls.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public String toString() {
        return "LiveStreamingUrlResponse(isLive=" + this.isLive + ", mirroring=" + this.mirroring + ", streamingUrlHls=" + this.streamingUrlHls + ", streamingUrlEdge=" + this.streamingUrlEdge + ", streamingUrlLlstreamVideo=" + this.streamingUrlLlstreamVideo + ", streamingUrlLlstreamAudio=" + this.streamingUrlLlstreamAudio + ", archiveUrlHls=" + this.archiveUrlHls + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.isLive ? 1 : 0);
        MirroringResponse mirroringResponse = this.mirroring;
        if (mirroringResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mirroringResponse.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.streamingUrlHls);
        parcel.writeString(this.streamingUrlEdge);
        parcel.writeString(this.streamingUrlLlstreamVideo);
        parcel.writeString(this.streamingUrlLlstreamAudio);
        parcel.writeString(this.archiveUrlHls);
        parcel.writeParcelable(this.status, i10);
    }
}
