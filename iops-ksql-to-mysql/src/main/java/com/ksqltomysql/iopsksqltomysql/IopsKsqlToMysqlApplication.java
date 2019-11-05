package com.ksqltomysql.iopsksqltomysql;

import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.ksqltomysql.iopsksqltomysql.repository.FiveMinutesAggDataRepository;

@SpringBootApplication
@EnableJpaAuditing
public class IopsKsqlToMysqlApplication {
	@Autowired
	static FiveMinutesAggDataRepository fiveMinutesAggDataRepository;

	public static void main(String[] args) {

			SpringApplication.run(IopsKsqlToMysqlApplication.class, args);
			/*FiveMinutesAggData f = new FiveMinutesAggData();
			f.setFromDate("FROMDATE");
			f.setToDate("TODATE");
			f.setKey("KEY");
			f.setValue("VALUE");

			saveAggData(fiveMinutesAggDataRepository,f);*/
	}

	public static void saveAggData(FiveMinutesAggDataRepository fiveMinutesAggDataRepository, FiveMinutesAggData fiveMinutesAggData){
		//fiveMinutesAggDataRepository.save(fiveMinutesAggData);
	}
}


