package com.ksqltomysql.iopsksqltomysql;

import entity.FiveMinutesAggData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import repository.FiveMinutesAggDataRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaAuditing
@EnableSwagger2
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


