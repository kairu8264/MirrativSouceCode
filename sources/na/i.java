package na;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameMissionProgress;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameMissionProgressStatusType;
import jo.p;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f41718f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f41719a;

    /* renamed from: b  reason: collision with root package name */
    public final String f41720b;

    /* renamed from: c  reason: collision with root package name */
    public final float f41721c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f41722d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f41723e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(LiveGameMissionProgress liveGameMissionProgress) {
            p.h(liveGameMissionProgress, "missionProgress");
            String valueOf = String.valueOf(liveGameMissionProgress.getGivenCoin());
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            sb2.append(liveGameMissionProgress.getMaxCoin());
            return new i(valueOf, sb2.toString(), liveGameMissionProgress.getStatus() == LiveGameMissionProgressStatusType.NOT_COMPLETED ? 1.0f : 0.2f, liveGameMissionProgress.getStatus() == LiveGameMissionProgressStatusType.COMPLETED, liveGameMissionProgress.getStatus() == LiveGameMissionProgressStatusType.INVALID);
        }
    }

    public i(String str, String str2, float f10, boolean z10, boolean z11) {
        p.h(str, "currentCoinText");
        p.h(str2, "totalCoinText");
        this.f41719a = str;
        this.f41720b = str2;
        this.f41721c = f10;
        this.f41722d = z10;
        this.f41723e = z11;
    }

    public final float a() {
        return this.f41721c;
    }

    public final String b() {
        return this.f41719a;
    }

    public final String c() {
        return this.f41720b;
    }

    public final boolean d() {
        return this.f41722d;
    }

    public final boolean e() {
        return this.f41723e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return p.c(this.f41719a, iVar.f41719a) && p.c(this.f41720b, iVar.f41720b) && p.c(Float.valueOf(this.f41721c), Float.valueOf(iVar.f41721c)) && this.f41722d == iVar.f41722d && this.f41723e == iVar.f41723e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f41719a.hashCode() * 31) + this.f41720b.hashCode()) * 31) + Float.hashCode(this.f41721c)) * 31;
        boolean z10 = this.f41722d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f41723e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "LiveGameMissionCoinBindModel(currentCoinText=" + this.f41719a + ", totalCoinText=" + this.f41720b + ", alpha=" + this.f41721c + ", isVisibleGetImage=" + this.f41722d + ", isVisibleInvalidImage=" + this.f41723e + ')';
    }
}
