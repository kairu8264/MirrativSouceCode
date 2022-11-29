package com.mirrativ.llstream.decoder;

import java.util.concurrent.atomic.AtomicLong;
import jo.p;

/* loaded from: classes4.dex */
public final class JitterCoordinator {
    private final PacketJitterConfig config = new PacketJitterConfig();
    private final AtomicLong audioPacketLastScheduledPTS = new AtomicLong(-1);
    private final AtomicLong audioPacketLastPlayedPTS = new AtomicLong(-1);
    private final AtomicLong audioPacketLastStackingCheckTimestamp = new AtomicLong(-1);
    private final AtomicLong audioPacketLastArrived = new AtomicLong(-1);
    private AtomicLong videoPacketSecondaryIDRTimestamp = new AtomicLong(-1);
    private final AtomicLong videoPacketLastTimestamp = new AtomicLong(-1);
    private final AtomicLong videoPacketLastIDRTimestamp = new AtomicLong(-1);
    private final AtomicLong videoPacketSecondLastIDRTimestamp = new AtomicLong(-1);
    private final AtomicLong videoPacketLastRenderedPTS = new AtomicLong(-1);
    private final AtomicLong videoPacketLastArrived = new AtomicLong(-1);

    public final AtomicLong getAudioPacketLastArrived() {
        return this.audioPacketLastArrived;
    }

    public final AtomicLong getAudioPacketLastPlayedPTS() {
        return this.audioPacketLastPlayedPTS;
    }

    public final AtomicLong getAudioPacketLastScheduledPTS() {
        return this.audioPacketLastScheduledPTS;
    }

    public final AtomicLong getAudioPacketLastStackingCheckTimestamp() {
        return this.audioPacketLastStackingCheckTimestamp;
    }

    public final PacketJitterConfig getConfig() {
        return this.config;
    }

    public final AtomicLong getVideoPacketLastArrived() {
        return this.videoPacketLastArrived;
    }

    public final AtomicLong getVideoPacketLastIDRTimestamp() {
        return this.videoPacketLastIDRTimestamp;
    }

    public final AtomicLong getVideoPacketLastRenderedPTS() {
        return this.videoPacketLastRenderedPTS;
    }

    public final AtomicLong getVideoPacketLastTimestamp() {
        return this.videoPacketLastTimestamp;
    }

    public final AtomicLong getVideoPacketSecondLastIDRTimestamp() {
        return this.videoPacketSecondLastIDRTimestamp;
    }

    public final AtomicLong getVideoPacketSecondaryIDRTimestamp() {
        return this.videoPacketSecondaryIDRTimestamp;
    }

    public final boolean isAcceptableVideoTimestamp(long j10) {
        if (this.audioPacketLastPlayedPTS.get() < 1) {
            return true;
        }
        long j11 = this.audioPacketLastPlayedPTS.get() * 1000;
        long j12 = this.videoPacketSecondLastIDRTimestamp.get();
        long j13 = this.videoPacketLastIDRTimestamp.get();
        long j14 = j10 + 1;
        if (j14 <= j12 && j12 < j11) {
            return false;
        }
        return !((j14 > j13 ? 1 : (j14 == j13 ? 0 : -1)) <= 0 && (j13 > j11 ? 1 : (j13 == j11 ? 0 : -1)) < 0);
    }

    public final void reset() {
        resetVideoTimestamps();
        resetAudioTimestamps();
    }

    public final void resetAudioTimestamps() {
        this.audioPacketLastPlayedPTS.set(-1L);
        this.audioPacketLastScheduledPTS.set(-1L);
        this.audioPacketLastStackingCheckTimestamp.set(-1L);
    }

    public final void resetVideoTimestamps() {
        this.videoPacketLastRenderedPTS.set(-1L);
        this.videoPacketLastIDRTimestamp.set(-1L);
        this.videoPacketLastTimestamp.set(-1L);
        this.videoPacketLastArrived.set(-1L);
        this.videoPacketSecondLastIDRTimestamp.set(-1L);
        this.videoPacketSecondaryIDRTimestamp.set(-1L);
    }

    public final void setVideoPacketSecondaryIDRTimestamp(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.videoPacketSecondaryIDRTimestamp = atomicLong;
    }
}
