package kuroneko.fun.system.platform.backup.service.impl;

import kuroneko.fun.system.platform.backup.service.MysqlBackupService;
import kuroneko.fun.system.platform.backup.util.MySqlBackupRestoreUtils;
import org.springframework.stereotype.Service;

/** @author kuroneko */
@Service
public class MysqlBackupServiceImpl implements MysqlBackupService {

  @Override
  public boolean backup(
      String host,
      String userName,
      String password,
      String backupFolderPath,
      String fileName,
      String database)
      throws Exception {
    return MySqlBackupRestoreUtils.backup(
        host, userName, password, backupFolderPath, fileName, database);
  }

  @Override
  public boolean backup(
      String host,
      String userName,
      String password,
      String backupFolderPath,
      String fileName,
      String database,
      String dockerName)
      throws Exception {
    return MySqlBackupRestoreUtils.backup(
        host, userName, password, backupFolderPath, fileName, database, dockerName);
  }

  @Override
  public boolean restore(
      String restoreFilePath, String host, String userName, String password, String database)
      throws Exception {
    return MySqlBackupRestoreUtils.restore(restoreFilePath, host, userName, password, database);
  }

  @Override
  public boolean restore(
      String restoreFilePath,
      String host,
      String userName,
      String password,
      String database,
      String dockerName)
      throws Exception {
    return MySqlBackupRestoreUtils.restore(
        restoreFilePath, host, userName, password, database, dockerName);
  }
}
