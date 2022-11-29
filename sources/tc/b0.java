package tc;

import com.dena.mirrativ.user.mypage.chat.ChatPageActivity;
import com.dena.mirrorman.net.api.response.Chat;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ b0 f53460w = new b0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int g10;
        g10 = ChatPageActivity.y.g((Chat.Message) obj, (Chat.Message) obj2);
        return g10;
    }
}
