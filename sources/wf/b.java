package wf;

import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.MediationServerParameters;

@Deprecated
/* loaded from: classes3.dex */
public interface b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters> {
    void destroy();

    @RecentlyNonNull
    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    Class<SERVER_PARAMETERS> getServerParametersType();
}
