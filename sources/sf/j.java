package sf;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import jo.p;

/* loaded from: classes3.dex */
public interface j extends Player.EventListener {

    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(j jVar, boolean z10) {
        }

        public static void b(j jVar, PlaybackParameters playbackParameters) {
            p.h(playbackParameters, "playbackParameters");
        }

        public static void c(j jVar, ExoPlaybackException exoPlaybackException) {
            p.h(exoPlaybackException, MRLog.PAYLOAD_KEY_ERROR);
        }

        public static void d(j jVar, int i10) {
        }

        public static void e(j jVar, int i10) {
        }

        public static void f(j jVar) {
        }

        public static void g(j jVar, boolean z10) {
        }

        public static void h(j jVar, Timeline timeline, Object obj, int i10) {
            p.h(timeline, "timeline");
        }

        public static void i(j jVar, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            p.h(trackGroupArray, "trackGroups");
            p.h(trackSelectionArray, "trackSelections");
        }
    }
}
