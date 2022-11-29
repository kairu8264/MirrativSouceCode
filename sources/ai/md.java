package ai;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: classes3.dex */
public final class md extends ld {

    /* renamed from: j  reason: collision with root package name */
    public final AudioTimestamp f6881j;

    /* renamed from: k  reason: collision with root package name */
    public long f6882k;

    /* renamed from: l  reason: collision with root package name */
    public long f6883l;

    /* renamed from: m  reason: collision with root package name */
    public long f6884m;

    public md() {
        super(null);
        this.f6881j = new AudioTimestamp();
    }

    @Override // ai.ld
    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f6882k = 0L;
        this.f6883l = 0L;
        this.f6884m = 0L;
    }

    @Override // ai.ld
    public final boolean f() {
        boolean timestamp = this.f6521a.getTimestamp(this.f6881j);
        if (timestamp) {
            long j10 = this.f6881j.framePosition;
            if (this.f6883l > j10) {
                this.f6882k++;
            }
            this.f6883l = j10;
            this.f6884m = j10 + (this.f6882k << 32);
        }
        return timestamp;
    }

    @Override // ai.ld
    public final long g() {
        return this.f6881j.nanoTime;
    }

    @Override // ai.ld
    public final long h() {
        return this.f6884m;
    }
}
