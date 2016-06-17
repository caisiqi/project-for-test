DROP PROCEDURE sp_query_config
GO

CREATE PROCEDURE sp_query_config
AS
BEGIN
	DECLARE @sql VARCHAR(1000)
	DECLARE @config_name VARCHAR(120)
	DECLARE @config_value VARCHAR(250)
	DECLARE c1 CURSOR FOR SELECT DISTINCT config_name, config_value FROM app_config WHERE app_name = 'MRP' AND config_name LIKE 'ftp.server.%'
	
	SET @sql = 'select ''MRP'' AS app_name'
	
	OPEN c1
	FETCH c1 INTO @config_name, @config_value
	WHILE @@sqlstatus = 0
		BEGIN
			SET @sql = @sql + ', ''' + @config_value + ''' AS ''' + @config_name + ''''
			FETCH c1 INTO @config_name, @config_value
		END
	CLOSE c1
	DEALLOCATE CURSOR c1
	
	--print '%1!', @sql
	EXEC(@sql)
END
GO