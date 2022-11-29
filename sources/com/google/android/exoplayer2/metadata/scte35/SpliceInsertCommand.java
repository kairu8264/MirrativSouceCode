package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* loaded from: classes3.dex */
    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }

        private ComponentSplice(int i10, long j10, long j11) {
            this.componentTag = i10;
            this.componentSplicePts = j10;
            this.componentSplicePlaybackPositionUs = j11;
        }
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j10, TimestampAdjuster timestampAdjuster) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        long j13;
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        boolean z15 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z15) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = C.TIME_UNSET;
            z12 = false;
            j12 = C.TIME_UNSET;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            boolean z16 = (readUnsignedByte & 128) != 0;
            boolean z17 = (readUnsignedByte & 64) != 0;
            boolean z18 = (readUnsignedByte & 32) != 0;
            boolean z19 = (readUnsignedByte & 16) != 0;
            long parseSpliceTime = (!z17 || z19) ? C.TIME_UNSET : TimeSignalCommand.parseSpliceTime(parsableByteArray, j10);
            if (!z17) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(readUnsignedByte2);
                for (int i13 = 0; i13 < readUnsignedByte2; i13++) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    long parseSpliceTime2 = !z19 ? TimeSignalCommand.parseSpliceTime(parsableByteArray, j10) : C.TIME_UNSET;
                    arrayList.add(new ComponentSplice(readUnsignedByte3, parseSpliceTime2, timestampAdjuster.adjustTsTimestamp(parseSpliceTime2)));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                boolean z20 = (128 & readUnsignedByte4) != 0;
                j13 = ((((readUnsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = C.TIME_UNSET;
            }
            i10 = parsableByteArray.readUnsignedShort();
            z13 = z17;
            i11 = parsableByteArray.readUnsignedByte();
            i12 = parsableByteArray.readUnsignedByte();
            list = emptyList;
            long j14 = parseSpliceTime;
            z12 = z14;
            j12 = j13;
            z11 = z19;
            z10 = z16;
            j11 = j14;
        }
        return new SpliceInsertCommand(readUnsignedInt, z15, z10, z13, z11, j11, timestampAdjuster.adjustTsTimestamp(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.componentSpliceList.get(i11).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<ComponentSplice> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.spliceEventId = j10;
        this.spliceEventCancelIndicator = z10;
        this.outOfNetworkIndicator = z11;
        this.programSpliceFlag = z12;
        this.spliceImmediateFlag = z13;
        this.programSplicePts = j11;
        this.programSplicePlaybackPositionUs = j12;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z14;
        this.breakDurationUs = j13;
        this.uniqueProgramId = i10;
        this.availNum = i11;
        this.availsExpected = i12;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
