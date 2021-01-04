package org.apache.hive.service.cli.session.cec;

import org.apache.hadoop.hive.ql.exec.FunctionInfo;
import org.apache.hadoop.hive.ql.exec.FunctionRegistry;
import org.apache.hadoop.hive.ql.exec.FunctionTask;
import org.apache.hadoop.hive.ql.exec.Registry;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.apache.hive.service.cli.HiveSQLException;
import org.apache.hive.service.cli.session.HiveSessionHook;
import org.apache.hive.service.cli.session.HiveSessionHookContext;
public class CecHiveSessionHook implements HiveSessionHook {
    @Override
    public void run(HiveSessionHookContext sessionHookContext) throws HiveSQLException {
        if(SessionState.get()!=null){
            Registry rs = SessionState.getRegistry();
            if(rs != null){
                try{
                    FunctionInfo info = rs.getFunctionInfo("cec_unix_timestamp");
                }

            }
        }

    }
}
