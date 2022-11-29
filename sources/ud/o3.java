package ud;

import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;

/* loaded from: classes2.dex */
public final class o3 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f55289d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ShooterTeamStatus f55290a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f55291b;

    /* renamed from: c  reason: collision with root package name */
    public final float f55292c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
            if (r7 == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ud.o3 a(com.dena.mirrorman.net.api.response.event.ShooterTeamStatus r6, java.util.List<? extends wn.k<com.dena.mirrorman.net.api.response.event.ShooterViewingUser, ? extends com.dena.mirrorman.net.api.response.event.ShooterMemberStatus>> r7) {
            /*
                r5 = this;
                java.lang.String r0 = "status"
                jo.p.h(r6, r0)
                java.lang.String r0 = "inviteViewerIds"
                jo.p.h(r7, r0)
                com.dena.mirrorman.net.api.response.event.ShooterTeamStatus r0 = com.dena.mirrorman.net.api.response.event.ShooterTeamStatus.NONE
                r1 = 1
                r2 = 0
                if (r6 != r0) goto L4b
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L1c
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L1c
            L1a:
                r7 = r2
                goto L48
            L1c:
                java.util.Iterator r7 = r7.iterator()
            L20:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L1a
                java.lang.Object r0 = r7.next()
                wn.k r0 = (wn.k) r0
                java.lang.Object r0 = r0.b()
                com.dena.mirrorman.net.api.response.event.ShooterMemberStatus r0 = (com.dena.mirrorman.net.api.response.event.ShooterMemberStatus) r0
                r3 = 2
                com.dena.mirrorman.net.api.response.event.ShooterMemberStatus[] r3 = new com.dena.mirrorman.net.api.response.event.ShooterMemberStatus[r3]
                com.dena.mirrorman.net.api.response.event.ShooterMemberStatus r4 = com.dena.mirrorman.net.api.response.event.ShooterMemberStatus.INVITING
                r3[r2] = r4
                com.dena.mirrorman.net.api.response.event.ShooterMemberStatus r4 = com.dena.mirrorman.net.api.response.event.ShooterMemberStatus.INVITED
                r3[r1] = r4
                java.util.List r3 = xn.s.m(r3)
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L20
                r7 = r1
            L48:
                if (r7 != 0) goto L4b
                goto L4c
            L4b:
                r1 = r2
            L4c:
                ud.o3 r7 = new ud.o3
                if (r1 == 0) goto L53
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L56
            L53:
                r0 = 1061997773(0x3f4ccccd, float:0.8)
            L56:
                r7.<init>(r6, r1, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.o3.a.a(com.dena.mirrorman.net.api.response.event.ShooterTeamStatus, java.util.List):ud.o3");
        }
    }

    public o3(ShooterTeamStatus shooterTeamStatus, boolean z10, float f10) {
        jo.p.h(shooterTeamStatus, "status");
        this.f55290a = shooterTeamStatus;
        this.f55291b = z10;
        this.f55292c = f10;
    }

    public final float a() {
        return this.f55292c;
    }

    public final boolean b() {
        return this.f55291b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o3) {
            o3 o3Var = (o3) obj;
            return this.f55290a == o3Var.f55290a && this.f55291b == o3Var.f55291b && jo.p.c(Float.valueOf(this.f55292c), Float.valueOf(o3Var.f55292c));
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f55290a.hashCode() * 31;
        boolean z10 = this.f55291b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + Float.hashCode(this.f55292c);
    }

    public String toString() {
        return "ShooterInviteBottomSheetDialogBindModel(status=" + this.f55290a + ", isEnablePlayButton=" + this.f55291b + ", playButtonAlpha=" + this.f55292c + ')';
    }
}
