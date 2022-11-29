package ce;

import com.dena.mirrorman.net.bcsvr.response.GiftRankingTopUser;

/* loaded from: classes2.dex */
public abstract class w {

    /* loaded from: classes2.dex */
    public static final class a extends w {

        /* renamed from: a  reason: collision with root package name */
        public final GiftRankingTopUser f19484a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GiftRankingTopUser giftRankingTopUser) {
            super(null);
            jo.p.h(giftRankingTopUser, "giftRankingTopUser");
            this.f19484a = giftRankingTopUser;
        }

        public final GiftRankingTopUser a() {
            return this.f19484a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends w {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19485a = new b();

        public b() {
            super(null);
        }
    }

    public w() {
    }

    public /* synthetic */ w(jo.h hVar) {
        this();
    }
}
