package ai;

import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tn0 implements r30<em0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(em0 em0Var, Map map) {
        em0 em0Var2 = em0Var;
        nq0 e10 = em0Var2.e();
        if (e10 == null) {
            try {
                nq0 nq0Var = new nq0(em0Var2, Float.parseFloat((String) map.get("duration")), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("customControlsAllowed")), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("clickToExpandAllowed")));
                em0Var2.J(nq0Var);
                e10 = nq0Var;
            } catch (NullPointerException e11) {
                e = e11;
                uj0.d("Unable to parse videoMeta message.", e);
                wg.t.h().k(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e12) {
                e = e12;
                uj0.d("Unable to parse videoMeta message.", e);
                wg.t.h().k(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i10 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i10 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (uj0.j(3)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 140);
            sb2.append("Video Meta GMSG: currentTime : ");
            sb2.append(parseFloat2);
            sb2.append(" , duration : ");
            sb2.append(parseFloat);
            sb2.append(" , isMuted : ");
            sb2.append(equals);
            sb2.append(" , playbackState : ");
            sb2.append(i10);
            sb2.append(" , aspectRatio : ");
            sb2.append(str);
            uj0.a(sb2.toString());
        }
        e10.U5(parseFloat2, parseFloat, i10, equals, parseFloat3);
    }
}
