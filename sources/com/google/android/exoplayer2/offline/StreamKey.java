package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.google.android.exoplayer2.offline.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    };
    public final int groupIndex;
    public final int periodIndex;
    public final int trackIndex;

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.trackIndex == streamKey.trackIndex;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.trackIndex;
    }

    public String toString() {
        return this.periodIndex + TopicConstant.SEPARATOR + this.groupIndex + TopicConstant.SEPARATOR + this.trackIndex;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.trackIndex);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.periodIndex = i10;
        this.groupIndex = i11;
        this.trackIndex = i12;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i10 = this.periodIndex - streamKey.periodIndex;
        if (i10 == 0) {
            int i11 = this.groupIndex - streamKey.groupIndex;
            return i11 == 0 ? this.trackIndex - streamKey.trackIndex : i11;
        }
        return i10;
    }

    public StreamKey(Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.trackIndex = parcel.readInt();
    }
}
