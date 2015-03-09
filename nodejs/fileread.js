var http = require('http');
var fs = require('fs');
var server = http.createServer();

fs.open('/home/manishdhir/npm', 'r', function(err, fd) {
	if (err) throw err;
	var readBuffer = new Buffer(1024),
		bufferOffset = 0;
		bufferLength = readBuffer.Length,
		FilePosition = 10;
		
		fs.read(fd, readBuffer, bufferOffset, bufferLength, FilePosition,
		function(err, readBytes) {
			if(err) throw err;
				console.log('just read ' + readBytes + 'bytes');
			if(readBytes > 0) {
				console.log(readBuffer.slice(0, readBytes));
			}
		});		
	});

server.on('request', function(req,res) {
	res.end('reading file');
});

server.listen(8000);


