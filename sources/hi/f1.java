package hi;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
public interface f1 extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(i1 i1Var) throws RemoteException;

    void getAppInstanceId(i1 i1Var) throws RemoteException;

    void getCachedAppInstanceId(i1 i1Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, i1 i1Var) throws RemoteException;

    void getCurrentScreenClass(i1 i1Var) throws RemoteException;

    void getCurrentScreenName(i1 i1Var) throws RemoteException;

    void getGmpAppId(i1 i1Var) throws RemoteException;

    void getMaxUserProperties(String str, i1 i1Var) throws RemoteException;

    void getTestFlag(i1 i1Var, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, i1 i1Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(yh.a aVar, o1 o1Var, long j10) throws RemoteException;

    void isDataCollectionEnabled(i1 i1Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, i1 i1Var, long j10) throws RemoteException;

    void logHealthData(int i10, String str, yh.a aVar, yh.a aVar2, yh.a aVar3) throws RemoteException;

    void onActivityCreated(yh.a aVar, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(yh.a aVar, long j10) throws RemoteException;

    void onActivityPaused(yh.a aVar, long j10) throws RemoteException;

    void onActivityResumed(yh.a aVar, long j10) throws RemoteException;

    void onActivitySaveInstanceState(yh.a aVar, i1 i1Var, long j10) throws RemoteException;

    void onActivityStarted(yh.a aVar, long j10) throws RemoteException;

    void onActivityStopped(yh.a aVar, long j10) throws RemoteException;

    void performAction(Bundle bundle, i1 i1Var, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(l1 l1Var) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(yh.a aVar, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(l1 l1Var) throws RemoteException;

    void setInstanceIdProvider(n1 n1Var) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, yh.a aVar, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(l1 l1Var) throws RemoteException;
}
