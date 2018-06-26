
package com.mdp.filemanager;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class FileSFTP {
    private String host;
    private int port;
    private String user;
    private String password;
    private Session session;
    private ChannelSftp channelSftp;

    public FileSFTP(String host, int port, String user, String password) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    public void connect() throws Exception {
        if (!this.isConected()) {
            JSch jsch = new JSch();
            this.session = jsch.getSession(this.user, this.host, this.port);
            this.session.setPassword(this.password);
            this.session.setConfig("StrictHostKeyChecking", "no");
            this.session.connect();
            this.channelSftp = (ChannelSftp) this.session.openChannel("sftp");
            this.channelSftp.connect();
        }
    }

    public void disconect() {
        this.session.disconnect();
    }
    
    public boolean isConected() {
        return (this.session != null && this.session.isConnected() && this.channelSftp != null && this.channelSftp.isConnected());
    }

    public void put(String filePath, String ftpPath) throws Exception {
        if (this.isConected()) {
            this.channelSftp.put(filePath, ftpPath);
        }else{
            throw new Exception("Session is not open.");
        }
    }

    public void get(String ftpPath, String filePath) throws Exception {
        if (this.isConected()) {
            this.channelSftp.get(filePath, ftpPath);
        }else{
            throw new Exception("Session is not open.");
        }
    }
}
