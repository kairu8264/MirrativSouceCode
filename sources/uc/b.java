package uc;

import android.content.Context;
import android.text.TextUtils;
import com.dena.mirrorman.net.api.response.Chat;
import java.util.List;
import jo.h;
import jo.p;
import of.n;
import ud.a;

/* loaded from: classes2.dex */
public final class b implements ud.a {
    public static final a I = new a(null);
    public static final int J = 8;
    public final String A;
    public final String B;
    public final boolean C;
    public final String D;
    public final int E;
    public final String F;
    public final String G;
    public final a.EnumC0862a H;

    /* renamed from: w  reason: collision with root package name */
    public final List<String> f54721w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54722x;

    /* renamed from: y  reason: collision with root package name */
    public final int f54723y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54724z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(Chat.Thread thread, Context context) {
            String sb2;
            int i10;
            p.h(thread, "thread");
            p.h(context, "context");
            List<String> imageUrls = thread.getImageUrls();
            String title = thread.getTitle();
            if (TextUtils.isEmpty(thread.getGroupId())) {
                sb2 = "";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append('(');
                sb3.append(thread.getGroupUserNum());
                sb3.append(')');
                sb2 = sb3.toString();
            }
            String str = sb2;
            String lastMessage = thread.getLastMessage();
            int i11 = (TextUtils.isEmpty(thread.getUnreadNum()) || p.c("0", thread.getUnreadNum())) ? 0 : 1;
            String e10 = n.f45411a.e(context, thread.getLastPostedAt());
            boolean z10 = thread.isNew() == 1 || i11 != 0;
            String unreadNum = thread.isNew() == 1 ? "NEW" : thread.getUnreadNum();
            if (thread.isNew() == 1) {
                i10 = nc.d.rectangle_corner20_yelloworange;
            } else {
                i10 = nc.d.rectangle_corner20_grapefruit;
            }
            return new b(imageUrls, title, i11, str, lastMessage, e10, z10, unreadNum, i10, thread.getUserId(), thread.getGroupId(), null, 2048, null);
        }
    }

    public b(List<String> list, String str, int i10, String str2, String str3, String str4, boolean z10, String str5, int i11, String str6, String str7, a.EnumC0862a enumC0862a) {
        p.h(list, "imageUrls");
        p.h(str, "titleText");
        p.h(str2, "groupUserNumText");
        p.h(str3, "lastMessageText");
        p.h(str4, "lastPostedAtText");
        p.h(str5, "unreadNumText");
        p.h(enumC0862a, "type");
        this.f54721w = list;
        this.f54722x = str;
        this.f54723y = i10;
        this.f54724z = str2;
        this.A = str3;
        this.B = str4;
        this.C = z10;
        this.D = str5;
        this.E = i11;
        this.F = str6;
        this.G = str7;
        this.H = enumC0862a;
    }

    public final String a() {
        return this.f54724z;
    }

    public final List<String> b() {
        return this.f54721w;
    }

    public final String c() {
        return this.A;
    }

    public final String d() {
        return this.B;
    }

    public final String e() {
        return this.f54722x;
    }

    public final int f() {
        return this.f54723y;
    }

    public final int g() {
        return this.E;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.H;
    }

    public final String h() {
        return this.D;
    }

    public final boolean i() {
        return this.C;
    }

    public /* synthetic */ b(List list, String str, int i10, String str2, String str3, String str4, boolean z10, String str5, int i11, String str6, String str7, a.EnumC0862a enumC0862a, int i12, h hVar) {
        this(list, str, i10, str2, str3, str4, z10, str5, i11, str6, str7, (i12 & 2048) != 0 ? a.EnumC0862a.MY_CHAT_THREAD : enumC0862a);
    }
}
