package sm;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g BYTES;
    public static final g GIGABYTES;
    public static final g KILOBYTES;
    public static final g MEGABYTES;
    public static final g TERABYTES;
    public long numBytes;

    /* loaded from: classes4.dex */
    public enum a extends g {
        public a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        TERABYTES = aVar;
        g gVar = new g("GIGABYTES", 1, 1073741824L) { // from class: sm.g.b
        };
        GIGABYTES = gVar;
        g gVar2 = new g("MEGABYTES", 2, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) { // from class: sm.g.c
        };
        MEGABYTES = gVar2;
        g gVar3 = new g("KILOBYTES", 3, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) { // from class: sm.g.d
        };
        KILOBYTES = gVar3;
        g gVar4 = new g("BYTES", 4, 1L) { // from class: sm.g.e
        };
        BYTES = gVar4;
        $VALUES = new g[]{aVar, gVar, gVar2, gVar3, gVar4};
    }

    public /* synthetic */ g(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public long a(long j10) {
        return (j10 * this.numBytes) / KILOBYTES.numBytes;
    }

    public g(String str, int i10, long j10) {
        this.numBytes = j10;
    }
}
