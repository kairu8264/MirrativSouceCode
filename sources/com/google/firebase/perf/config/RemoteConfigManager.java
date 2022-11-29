package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lm.a;
import vi.d;
import vm.e;
import vm.h;
import vm.l;
import xl.b;

@Keep
/* loaded from: classes4.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, h> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final Executor executor;
    private e firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private b<l> firebaseRemoteConfigProvider;
    private static final a logger = a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    private RemoteConfigManager() {
        this(new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private h getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            h hVar = this.allRcConfigMap.get(str);
            if (hVar.a() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", hVar.b(), str);
                return hVar;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        return j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.g().h(this.executor, new vi.e() { // from class: im.x
            @Override // vi.e
            public final void onSuccess(Object obj) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).e(this.executor, new d() { // from class: im.w
            @Override // vi.d
            public final void a(Exception exc) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                syncConfigValues(this.firebaseRemoteConfig.h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public sm.e<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return sm.e.a();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return sm.e.e(Boolean.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return sm.e.a();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public sm.e<Float> getFloat(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config float value is null.");
            return sm.e.a();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return sm.e.e(Float.valueOf(Double.valueOf(remoteConfigValue.d()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return sm.e.a();
    }

    public sm.e<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return sm.e.a();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return sm.e.e(Long.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return sm.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        Object obj;
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t10;
        }
        try {
            if (t10 instanceof Boolean) {
                obj = Boolean.valueOf(remoteConfigValue.e());
            } else if (t10 instanceof Float) {
                obj = Float.valueOf(Double.valueOf(remoteConfigValue.d()).floatValue());
            } else {
                if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                    if (t10 instanceof String) {
                        obj = remoteConfigValue.b();
                    } else {
                        T t11 = (T) remoteConfigValue.b();
                        try {
                            logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                            return t11;
                        } catch (IllegalArgumentException unused) {
                            t10 = t11;
                            if (remoteConfigValue.b().isEmpty()) {
                                return t10;
                            }
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                            return t10;
                        }
                    }
                }
                obj = Long.valueOf(remoteConfigValue.c());
            }
            return obj;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public sm.e<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return sm.e.a();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return sm.e.e(remoteConfigValue.b());
        }
        return sm.e.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        b<l> bVar;
        l lVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (lVar = bVar.get()) != null) {
            this.firebaseRemoteConfig = lVar.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        e eVar = this.firebaseRemoteConfig;
        return eVar == null || eVar.i().a() == 1;
    }

    public void setFirebaseRemoteConfigProvider(b<l> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    public void syncConfigValues(Map<String, h> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
    }

    public RemoteConfigManager(Executor executor, e eVar) {
        this(executor, eVar, new Random().nextInt(25000) + 5000);
    }

    public RemoteConfigManager(Executor executor, e eVar, long j10) {
        ConcurrentHashMap<String, h> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.executor = executor;
        this.firebaseRemoteConfig = eVar;
        if (eVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(eVar.h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = TimeUnit.MICROSECONDS.toMillis(FirebasePerfProvider.getAppStartTime().d());
        this.appStartConfigFetchDelayInMs = j10;
    }
}
