package ud;

import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUserBasic;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f55372d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f55373a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55374b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55375c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q0 a(Resources resources, GiftGachaUserBasic giftGachaUserBasic) {
            jo.p.h(resources, "resources");
            jo.p.h(giftGachaUserBasic, MRLog.TARGET_TYPE_USER);
            int userId = giftGachaUserBasic.getUserId();
            String profileImageUrl = giftGachaUserBasic.getProfileImageUrl();
            String string = resources.getString(nd.f1.text_giftgacha_title_username, giftGachaUserBasic.getName());
            jo.p.g(string, "resources.getString(R.st…itle_username, user.name)");
            return new q0(userId, profileImageUrl, string);
        }

        public final q0 b(Resources resources, GiftGachaUserBasic giftGachaUserBasic) {
            jo.p.h(resources, "resources");
            jo.p.h(giftGachaUserBasic, MRLog.TARGET_TYPE_USER);
            int userId = giftGachaUserBasic.getUserId();
            String profileImageUrl = giftGachaUserBasic.getProfileImageUrl();
            String string = resources.getString(nd.f1.text_giftgacha_title_you);
            jo.p.g(string, "resources.getString(R.st…text_giftgacha_title_you)");
            return new q0(userId, profileImageUrl, string);
        }

        public final q0 c() {
            return new q0(0, "", "");
        }
    }

    public q0(int i10, String str, String str2) {
        jo.p.h(str, "profileImageUrl");
        jo.p.h(str2, "titleText");
        this.f55373a = i10;
        this.f55374b = str;
        this.f55375c = str2;
    }

    public final String a() {
        return this.f55374b;
    }

    public final String b() {
        return this.f55375c;
    }

    public final int c() {
        return this.f55373a;
    }
}
