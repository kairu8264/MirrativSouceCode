package tc;

import com.dena.mirrativ.user.mypage.chat.ChatPageActivity;
import com.dena.mirrorman.net.api.response.Chat;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ p f53559w = new p();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int c52;
        c52 = ChatPageActivity.c5((Chat.Message) obj, (Chat.Message) obj2);
        return c52;
    }
}
