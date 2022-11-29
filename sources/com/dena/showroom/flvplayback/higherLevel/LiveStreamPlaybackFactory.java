package com.dena.showroom.flvplayback.higherLevel;

/* loaded from: classes3.dex */
public class LiveStreamPlaybackFactory {
    public static LiveStreamPlayback open(StreamEndpoint streamEndpoint) {
        if (streamEndpoint instanceof RTMPStreamEndpoint) {
            return new RTMPMoviePlayer(((RTMPStreamEndpoint) streamEndpoint).getEndpoint());
        }
        if (streamEndpoint instanceof HLSStreamEndpoint) {
            return new HLSMoviePlayer((HLSStreamEndpoint) streamEndpoint);
        }
        throw new IllegalArgumentException("No player class available to play the given endpoint.");
    }
}
