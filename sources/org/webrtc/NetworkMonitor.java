package org.webrtc;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.NetworkMonitorAutoDetect;

/* loaded from: classes4.dex */
public class NetworkMonitor {
    private static final String TAG = "NetworkMonitor";
    private NetworkMonitorAutoDetect autoDetect;
    private final Object autoDetectLock;
    private volatile NetworkMonitorAutoDetect.ConnectionType currentConnectionType;
    private final ArrayList<Long> nativeNetworkObservers;
    private final ArrayList<NetworkObserver> networkObservers;
    private int numObservers;

    /* loaded from: classes4.dex */
    public static class InstanceHolder {
        public static final NetworkMonitor instance = new NetworkMonitor();

        private InstanceHolder() {
        }
    }

    /* loaded from: classes4.dex */
    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkMonitorAutoDetect.ConnectionType connectionType);
    }

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    @CalledByNative
    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected to be true");
        }
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context) {
        NetworkMonitor networkMonitor = getInstance();
        NetworkMonitorAutoDetect createAutoDetect = networkMonitor.createAutoDetect(context);
        networkMonitor.autoDetect = createAutoDetect;
        return createAutoDetect;
    }

    private NetworkMonitorAutoDetect createAutoDetect(Context context) {
        return new NetworkMonitorAutoDetect(new NetworkMonitorAutoDetect.Observer() { // from class: org.webrtc.NetworkMonitor.1
            @Override // org.webrtc.NetworkMonitorAutoDetect.Observer
            public void onConnectionTypeChanged(NetworkMonitorAutoDetect.ConnectionType connectionType) {
                NetworkMonitor.this.updateCurrentConnectionType(connectionType);
            }

            @Override // org.webrtc.NetworkMonitorAutoDetect.Observer
            public void onNetworkConnect(NetworkMonitorAutoDetect.NetworkInformation networkInformation) {
                NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
            }

            @Override // org.webrtc.NetworkMonitorAutoDetect.Observer
            public void onNetworkDisconnect(long j10) {
                NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j10);
            }
        }, context);
    }

    private NetworkMonitorAutoDetect.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    private long getCurrentDefaultNetId() {
        long defaultNetId;
        synchronized (this.autoDetectLock) {
            NetworkMonitorAutoDetect networkMonitorAutoDetect = this.autoDetect;
            defaultNetId = networkMonitorAutoDetect == null ? -1L : networkMonitorAutoDetect.getDefaultNetId();
        }
        return defaultNetId;
    }

    @CalledByNative
    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    private List<Long> getNativeNetworkObserversSync() {
        ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            arrayList = new ArrayList(this.nativeNetworkObservers);
        }
        return arrayList;
    }

    @Deprecated
    public static void init(Context context) {
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != NetworkMonitorAutoDetect.ConnectionType.CONNECTION_NONE;
    }

    private native void nativeNotifyConnectionTypeChanged(long j10);

    private native void nativeNotifyOfActiveNetworkList(long j10, NetworkMonitorAutoDetect.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j10, NetworkMonitorAutoDetect.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j10, long j11);

    @CalledByNative
    private boolean networkBindingSupported() {
        boolean z10;
        synchronized (this.autoDetectLock) {
            NetworkMonitorAutoDetect networkMonitorAutoDetect = this.autoDetect;
            z10 = networkMonitorAutoDetect != null && networkMonitorAutoDetect.supportNetworkCallback();
        }
        return z10;
    }

    private void notifyObserversOfConnectionTypeChange(NetworkMonitorAutoDetect.ConnectionType connectionType) {
        ArrayList<NetworkObserver> arrayList;
        for (Long l10 : getNativeNetworkObserversSync()) {
            nativeNotifyConnectionTypeChanged(l10.longValue());
        }
        synchronized (this.networkObservers) {
            arrayList = new ArrayList(this.networkObservers);
        }
        for (NetworkObserver networkObserver : arrayList) {
            networkObserver.onConnectionTypeChanged(connectionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkConnect(NetworkMonitorAutoDetect.NetworkInformation networkInformation) {
        for (Long l10 : getNativeNetworkObserversSync()) {
            nativeNotifyOfNetworkConnect(l10.longValue(), networkInformation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkDisconnect(long j10) {
        for (Long l10 : getNativeNetworkObserversSync()) {
            nativeNotifyOfNetworkDisconnect(l10.longValue(), j10);
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(NetworkMonitorAutoDetect.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j10) {
        List<NetworkMonitorAutoDetect.NetworkInformation> activeNetworkList;
        synchronized (this.autoDetectLock) {
            NetworkMonitorAutoDetect networkMonitorAutoDetect = this.autoDetect;
            activeNetworkList = networkMonitorAutoDetect == null ? null : networkMonitorAutoDetect.getActiveNetworkList();
        }
        if (activeNetworkList == null || activeNetworkList.size() == 0) {
            return;
        }
        nativeNotifyOfActiveNetworkList(j10, (NetworkMonitorAutoDetect.NetworkInformation[]) activeNetworkList.toArray(new NetworkMonitorAutoDetect.NetworkInformation[activeNetworkList.size()]));
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkMonitorAutoDetect getNetworkMonitorAutoDetect() {
        NetworkMonitorAutoDetect networkMonitorAutoDetect;
        synchronized (this.autoDetectLock) {
            networkMonitorAutoDetect = this.autoDetect;
        }
        return networkMonitorAutoDetect;
    }

    public int getNumObservers() {
        int i10;
        synchronized (this.autoDetectLock) {
            i10 = this.numObservers;
        }
        return i10;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void startMonitoring(Context context) {
        synchronized (this.autoDetectLock) {
            this.numObservers++;
            if (this.autoDetect == null) {
                this.autoDetect = createAutoDetect(context);
            }
            this.currentConnectionType = NetworkMonitorAutoDetect.getConnectionType(this.autoDetect.getCurrentNetworkState());
        }
    }

    public void stopMonitoring() {
        synchronized (this.autoDetectLock) {
            int i10 = this.numObservers - 1;
            this.numObservers = i10;
            if (i10 == 0) {
                this.autoDetect.destroy();
                this.autoDetect = null;
            }
        }
    }

    private NetworkMonitor() {
        this.autoDetectLock = new Object();
        this.nativeNetworkObservers = new ArrayList<>();
        this.networkObservers = new ArrayList<>();
        this.numObservers = 0;
        this.currentConnectionType = NetworkMonitorAutoDetect.ConnectionType.CONNECTION_UNKNOWN;
    }

    @CalledByNative
    private void stopMonitoring(long j10) {
        Logging.d(TAG, "Stop monitoring with native observer " + j10);
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j10));
        }
    }

    @Deprecated
    public void startMonitoring() {
        startMonitoring(ContextUtils.getApplicationContext());
    }

    @CalledByNative
    private void startMonitoring(Context context, long j10) {
        Logging.d(TAG, "Start monitoring with native observer " + j10);
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j10));
        }
        updateObserverActiveNetworkList(j10);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }
}
