package ai;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public class ld {

    /* renamed from: a  reason: collision with root package name */
    public AudioTrack f6521a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6522b;

    /* renamed from: c  reason: collision with root package name */
    public int f6523c;

    /* renamed from: d  reason: collision with root package name */
    public long f6524d;

    /* renamed from: e  reason: collision with root package name */
    public long f6525e;

    /* renamed from: f  reason: collision with root package name */
    public long f6526f;

    /* renamed from: g  reason: collision with root package name */
    public long f6527g;

    /* renamed from: h  reason: collision with root package name */
    public long f6528h;

    /* renamed from: i  reason: collision with root package name */
    public long f6529i;

    public /* synthetic */ ld(od odVar) {
    }

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f6521a = audioTrack;
        this.f6522b = z10;
        this.f6527g = C.TIME_UNSET;
        this.f6524d = 0L;
        this.f6525e = 0L;
        this.f6526f = 0L;
        if (audioTrack != null) {
            this.f6523c = audioTrack.getSampleRate();
        }
    }

    public final void b(long j10) {
        this.f6528h = d();
        this.f6527g = SystemClock.elapsedRealtime() * 1000;
        this.f6529i = j10;
        this.f6521a.stop();
    }

    public final void c() {
        if (this.f6527g != C.TIME_UNSET) {
            return;
        }
        this.f6521a.pause();
    }

    public final long d() {
        if (this.f6527g != C.TIME_UNSET) {
            return Math.min(this.f6529i, this.f6528h + ((((SystemClock.elapsedRealtime() * 1000) - this.f6527g) * this.f6523c) / 1000000));
        }
        int playState = this.f6521a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f6521a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f6522b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6526f = this.f6524d;
            }
            playbackHeadPosition += this.f6526f;
        }
        if (this.f6524d > playbackHeadPosition) {
            this.f6525e++;
        }
        this.f6524d = playbackHeadPosition;
        return playbackHeadPosition + (this.f6525e << 32);
    }

    public final long e() {
        return (d() * 1000000) / this.f6523c;
    }

    public boolean f() {
        return false;
    }

    public long g() {
        throw new UnsupportedOperationException();
    }

    public long h() {
        throw new UnsupportedOperationException();
    }
}
