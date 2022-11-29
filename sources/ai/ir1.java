package ai;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class ir1 {

    /* renamed from: a  reason: collision with root package name */
    public final AudioTrack f5333a;

    /* renamed from: b  reason: collision with root package name */
    public final AudioTimestamp f5334b = new AudioTimestamp();

    /* renamed from: c  reason: collision with root package name */
    public long f5335c;

    /* renamed from: d  reason: collision with root package name */
    public long f5336d;

    /* renamed from: e  reason: collision with root package name */
    public long f5337e;

    public ir1(AudioTrack audioTrack) {
        this.f5333a = audioTrack;
    }

    public final boolean a() {
        boolean timestamp = this.f5333a.getTimestamp(this.f5334b);
        if (timestamp) {
            long j10 = this.f5334b.framePosition;
            if (this.f5336d > j10) {
                this.f5335c++;
            }
            this.f5336d = j10;
            this.f5337e = j10 + (this.f5335c << 32);
        }
        return timestamp;
    }

    public final long b() {
        return this.f5334b.nanoTime / 1000;
    }

    public final long c() {
        return this.f5337e;
    }
}
