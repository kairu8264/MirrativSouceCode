package z8;

import com.dena.mirrorman.net.api.response.MissionStatusResponse;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62657a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: z8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1084b extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f62658b = MissionStatusResponse.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final MissionStatusResponse f62659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1084b(MissionStatusResponse missionStatusResponse) {
            super(null);
            jo.p.h(missionStatusResponse, "response");
            this.f62659a = missionStatusResponse;
        }

        public final MissionStatusResponse a() {
            return this.f62659a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1084b) && jo.p.c(this.f62659a, ((C1084b) obj).f62659a);
        }

        public int hashCode() {
            return this.f62659a.hashCode();
        }

        public String toString() {
            return "LoadMissionStatus(response=" + this.f62659a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
