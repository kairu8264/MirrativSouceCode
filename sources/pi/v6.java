package pi;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class v6 implements ha {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i7 f48286a;

    public v6(i7 i7Var) {
        this.f48286a = i7Var;
    }

    @Override // pi.ha
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f48286a.s(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle, str);
        } else {
            this.f48286a.p(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle);
        }
    }
}
